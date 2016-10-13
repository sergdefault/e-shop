package tsymbaliuk.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tsymbaliuk.dao.CategoryDAO;
import tsymbaliuk.model.Category;
import java.util.List;

/**
 * Created by Tsymbaliuk Serhii on 04.09.2016.
 */
@Service
public class CategoryDaoImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCategory(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(category);
        session.getTransaction().commit();

    }

    @Override
    public void updateCategory(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(category);
        session.getTransaction().commit();

    }

    @Override
    public Category getCategoryById(int category_id) {
        Session session = sessionFactory.getCurrentSession();
        Category category = null;
        session.beginTransaction();
        category = (Category) session.get(Category.class, category_id);

        return category;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Category> getAllCategories() {
            Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Category.class);
            return criteria.list();
    }

    @Override
    public void deleteCategory(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete Category where category_id = :category_id");
        query.setParameter("category_id", id);
        query.executeUpdate();
    }

}
