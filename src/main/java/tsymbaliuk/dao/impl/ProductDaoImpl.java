package tsymbaliuk.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tsymbaliuk.dao.ProductDAO;
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
        Query query = sessionFactory.getCurrentSession().createQuery("from products where category = :category ");
        query.setParameter("category", category_id);
        List list = query.list();
        return list;
    }
}
