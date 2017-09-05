package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.Category;
import pl.akademiakodu.kwejk.Gif;

import java.util.List;

public interface CategoryDao {
        List<Category> findAll();
        Category findOne(String name);
    }


