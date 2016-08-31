package tsymbaliuk.dao;

import tsymbaliuk.model.Category;
import tsymbaliuk.model.Product;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Цымбалюк Сергей on 31.08.2016.
 */
public interface CategoryDAO {
    public void addCategory(Category category) throws SQLException;
    public void updateCategory(Long category_id, Category category) throws SQLException;
    public Category getCategoryById(Long category_id) throws SQLException;
    public Collection getAllCategories() throws SQLException;
    public void deleteCategory(Category category) throws SQLException;
    public Collection getCategoriesByProduct(Product product) throws SQLException;
}
