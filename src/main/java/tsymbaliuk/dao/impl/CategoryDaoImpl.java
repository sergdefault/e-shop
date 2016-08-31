package tsymbaliuk.dao.impl;

import org.hibernate.Session;
import tsymbaliuk.dao.CategoryDAO;
import tsymbaliuk.model.Category;
import tsymbaliuk.model.Product;
import tsymbaliuk.util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Цымбалюк Сергей on 31.08.2016.
 */
public class CategoryDaoImpl implements CategoryDAO {
    private Session session;

    public CategoryDaoImpl() {
        session=HibernateUtil.getSession();
    }

    @Override
    public void addCategory(Category category) throws SQLException {
            session.beginTransaction();
            session.save(category);
            session.getTransaction().commit();
    }

    @Override
    public void updateCategory(int category_id, Category category) throws SQLException {
            session.beginTransaction();
            Category cat= session.load(Category.class,category_id);
            cat.setDescription(category.getDescription());
            cat.setTitle(category.getTitle());
            session.flush();
            session.getTransaction().commit();
    }

    @Override
    public Category getCategoryById(int category_id) throws SQLException {
        Category cat= session.load(Category.class,category_id);
        return cat;
    }

    @Override
    public Collection getAllCategories() throws SQLException {
        List categories = new ArrayList<Category>();
        try {
            categories = session.createCriteria(Category.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return categories;
    }


    @Override
    public void deleteCategory(Category category) throws SQLException {
        session.beginTransaction();
        session.delete(category);
        session.getTransaction().commit();
    }
}


