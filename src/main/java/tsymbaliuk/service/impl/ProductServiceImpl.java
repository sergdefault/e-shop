package tsymbaliuk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tsymbaliuk.dao.ProductDAO;
import tsymbaliuk.model.Product;
import tsymbaliuk.service.ProductService;

import java.util.List;

/**
 * Created by Tsymbaliuk Serhii on 30.09.2016.
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private  ProductDAO productDAO;


    @Override
    @Transactional
    public List<Product> getAllproductByCategoryId(int category_id) {
        return productDAO.getAllProductByCategoryId(category_id);
    }
}
