package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.Category;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDaoImpl implements CategoryDao {


    public CategoryDaoImpl() {    }

    private static List<Category> categories = new ArrayList<>();

    static
    {
        categories.add(new Category(1, "animals"));
        categories.add(new Category(2, "humans"));
        categories.add(new Category(3, "science"));
    }

    @Override
    public List<Category> findAll()
    {
        return categories;
    }

    @Override
    public Category findOne(String name)
    {
        for (Category category : categories)
        {
            if (category.getName().equals(name))
            {
                return category;
            }
        }
        return null;
    }
}
