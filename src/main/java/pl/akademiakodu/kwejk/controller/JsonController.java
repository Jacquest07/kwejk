package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.kwejk.Category;
import pl.akademiakodu.kwejk.Gif;
import pl.akademiakodu.kwejk.dao.CategoryDao;
import pl.akademiakodu.kwejk.dao.GifDao;

import java.util.List;

/**
 * Created by Eriot on 2017-09-06.
 */

@RestController
@RequestMapping("/api")
public class JsonController
{

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private GifDao gifDao;

    @RequestMapping("/categories")
    public List<Category> categoriesJson()
    {
        return categoryDao.findAll();
    }

    @RequestMapping("/gifs{name}")
    public Gif gifJson(@RequestParam String q)
    {
        return gifDao.findOne(q);
    }
}
