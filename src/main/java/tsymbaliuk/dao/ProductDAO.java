package tsymbaliuk.dao;

import tsymbaliuk.model.Category;
import tsymbaliuk.model.Product;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Цымбалюк Сергей on 31.08.2016.
 */
public interface ProductDAO {
    public void addProduct(Product product) throws SQLException;
    public void updateProduct(Long product_id, Product product) throws SQLException;
    public Category getProductById(Long product_id) throws SQLException;
    public Collection getAllProducts() throws SQLException;
    public Collection getAllProductsByCategory(Category category) throws SQLException;
    public void deleteProduct(Product product ) throws SQLException;
    public Collection getCategoriesByProduct(Product product) throws SQLException;
}
