package tsymbaliuk.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tsymbaliuk.dao.ProductDAO;
import tsymbaliuk.model.Category;
import tsymbaliuk.model.Product;

import java.util.List;

/**
 * Created by Цымбалюк Сергей on 30.09.2016.
 */
@Service
public class ProductDaoImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Product> getAllProductByCategoryId(int category_id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Product where category_id =  "+category_id);
        List list = query.list();
        return list;
    }

    @Override
    public Product getProductById(int product_id) {
        Product product= null;
        product = (Product) sessionFactory.getCurrentSession().get(Product.class, product_id);
        return product;
    }
}
