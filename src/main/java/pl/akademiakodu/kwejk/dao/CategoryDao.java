package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.Category;

import java.util.List;

public interface CategoryDao {
        List<Category> findAll();
        Category findOne(String name);
        Category showCategoryName(Integer id);
    }


