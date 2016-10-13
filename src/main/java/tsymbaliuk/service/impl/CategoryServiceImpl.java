package tsymbaliuk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tsymbaliuk.dao.CategoryDAO;
import tsymbaliuk.model.Category;
import tsymbaliuk.service.CategoryService;

import java.util.List;

/**
 * Created by Цымбалюк Сергей on 27.09.2016.
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;


    @Override
    @Transactional
    public List<Category> getAllCategories() {
        return categoryDAO.getAllCategories();
    }

    @Override
    @Transactional
    public void addCategory(Category category) {
        categoryDAO.addCategory(category);
    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    @Transactional
    public void deleteCategory(int category_id) {
        categoryDAO.deleteCategory(category_id);
    }

    @Override
    public Category getCategoryById(int category_id) {
        return null;
    }
}
