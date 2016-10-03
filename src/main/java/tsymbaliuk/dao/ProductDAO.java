package tsymbaliuk.dao;

import tsymbaliuk.model.Product;

import java.util.List;

/**
 * Created by Tsymbaliuk Serhii on 30.09.2016.
 */
public interface ProductDAO {
    List<Product> getAllProductByCategoryId(int category_id);
}
