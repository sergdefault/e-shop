package tsymbaliuk.dao.impl;

import tsymbaliuk.dao.ProductDAO;
import tsymbaliuk.model.Category;
import tsymbaliuk.model.Product;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Цымбалюк Сергей on 31.08.2016.
 */
public class ProductDaoImpl implements ProductDAO{


    @Override
    public void addProduct(Product product) throws SQLException {

    }

    @Override
    public void updateProduct(Long product_id, Product product) throws SQLException {

    }

    @Override
    public Category getProductById(Long product_id) throws SQLException {
        return null;
    }

    @Override
    public Collection getAllProducts() throws SQLException {
        return null;
    }

    @Override
    public Collection getAllProductsByCategory(Category category) throws SQLException {
        return null;

    }

    @Override
    public void deleteProduct(Product product) throws SQLException {

    }

    @Override
    public Collection getCategoriesByProduct(Product product) throws SQLException {
        return null;
    }
}
