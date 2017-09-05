package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.dao.CategoryDao;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class CategoryController
{

    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/categories")
    public String home(ModelMap modelMap){

        modelMap.addAttribute("category", categoryDao.findAll());
        return "categories";
    }

    @GetMapping("/categories/{name}")
    public String searchResult(@PathVariable String name, ModelMap modelMap)
    {
        modelMap.addAttribute("category", categoryDao.findOne(name));
        return "category";
    }


}
