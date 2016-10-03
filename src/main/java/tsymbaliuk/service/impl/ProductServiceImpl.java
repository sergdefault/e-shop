package tsymbaliuk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tsymbaliuk.dao.ProductDAO;
import tsymbaliuk.service.ProductService;

/**
 * Created by Tsymbaliuk Serhii on 30.09.2016.
 */
@Service
public class ProductServiceImpl implements ProductService{

//    @Autowired
//    private  ProductDAO productDAO;

    @Override
    public void getAllproductByCategoryId(int category_id) {
       // productDAO.getAllProductByCategoryId(category_id);
    }
}
