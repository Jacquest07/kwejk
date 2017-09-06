package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.kwejk.Category;
import pl.akademiakodu.kwejk.dao.CategoryDao;

import java.util.List;

/**
 * Created by Eriot on 2017-09-06.
 */

@RestController
public class JsonController
{

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping("/api/categories")
    public List<Category> categoriesJson()
    {
        return categoryDao.findAll();
    }
}
