package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.Category;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDaoImpl implements CategoryDao {


    public CategoryDaoImpl() {    }

    private static List<Category> categories = new ArrayList<>();

    public static List<Category> getCategories() {
        return categories;
    }

    public static void setCategories(List<Category> categories) {
        CategoryDaoImpl.categories = categories;
    }

    static
    {
        categories.add(new Category(0, "animals"));
        categories.add(new Category(1, "humans"));
        categories.add(new Category(2, "science"));
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
    @Override
    public Category showCategoryName(Integer id)
    {
        for (Category category : categories)
        {
            if(category.getId()==id)
                return category;
        }
        return null;
    }
}
