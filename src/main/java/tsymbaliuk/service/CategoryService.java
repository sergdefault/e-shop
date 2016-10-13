package tsymbaliuk.service;

import tsymbaliuk.model.Category;

import java.util.List;

/**
 * Created by Tsymbaliuk Serhii on 28.09.2016.
 */
public interface CategoryService {
    List<Category> getAllCategories();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(int category_id);
    Category getCategoryById(int category_id);
}
