package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.kwejk.dao.CategoryDao;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.kwejk.dao.GifDao;


@Controller
public class CategoryController
{
    @Autowired
    private GifDao gifDao;
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/categories")
    public String home(ModelMap modelMap){

        modelMap.addAttribute("categories", categoryDao.findAll());
        return "categories";
    }

    @GetMapping("/categories/{name}")
    public String searchResult(@PathVariable String name, ModelMap modelMap)
    {
        modelMap.addAttribute("categories", categoryDao.findOne(name));
        return "category";
    }


    @GetMapping("/category/{id}")
    public String showCategory(@PathVariable Integer id, ModelMap modelMap)
    {
        modelMap.addAttribute("category",categoryDao.showCategoryName(id));
        modelMap.addAttribute("gifs", gifDao.findId(id));
        return "category";
    }


}
