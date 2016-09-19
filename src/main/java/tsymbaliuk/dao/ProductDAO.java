package tsymbaliuk.dao;

import tsymbaliuk.model.Category;
import tsymbaliuk.model.Product;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Цымбалюк Сергей on 31.08.2016.
 */
public interface ProductDAO {
    public void addProduct(Product product);
    public void updateProduct(Long product_id, Product product);
    public Category getProductById(Long product_id);
    public Collection getAllProducts() throws SQLException;
    public Collection getAllProductsByCategory(Category category);
    public void deleteProduct(Product product );
    public Collection getCategoriesByProduct(Product product);
}
