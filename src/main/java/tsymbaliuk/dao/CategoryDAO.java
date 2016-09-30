package tsymbaliuk.dao;

import tsymbaliuk.model.Category;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * Created by Цымбалюк Сергей on 31.08.2016.
 */
public interface CategoryDAO {
    public void addCategory(Category category);
    public void updateCategory(Category category);
    public Category getCategoryById(int category_id);
    public List<Category> getAllCategories();
    public void deleteCategory(Category category);
}
