package tsymbaliuk.dao.daoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import tsymbaliuk.dao.CategoryDAO;
import tsymbaliuk.model.Category;
import tsymbaliuk.model.Product;
import tsymbaliuk.util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Цымбалюк Сергей on 04.09.2016.
 */
public class CategoryDaoImpl implements CategoryDAO {
    @Override
    public void addCategory(Category category) throws SQLException {

    }

    @Override
    public void updateCategory(int category_id, Category category) throws SQLException {

    }

    @Override
    public Category getCategoryById(int category_id)  {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Category category = null;
        try {
            session.beginTransaction();
            category = (Category) session.get(Category.class, category_id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.getTransaction().commit();
            sessionFactory.close();
        }
        return category;
    }

    @Override
    public Collection getAllCategories() throws SQLException {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Category> categories = new ArrayList<>();
        try {
            session.beginTransaction();
            categories=session.createCriteria(Category.class).list();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.getTransaction().commit();
            sessionFactory.close();
        }
        return categories;
    }

    @Override
    public void deleteCategory(Category category) throws SQLException {

    }
}
