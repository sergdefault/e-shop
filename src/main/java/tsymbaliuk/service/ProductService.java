package tsymbaliuk.service;

import org.springframework.stereotype.Service;
import tsymbaliuk.model.Product;

import java.util.List;

/**
 * Created by Tsymbaliuk Serhii on 30.09.2016.
 */

public interface ProductService {
    List<Product> getAllproductByCategoryId(int category_id);
}
