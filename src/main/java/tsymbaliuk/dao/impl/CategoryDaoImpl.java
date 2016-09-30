package tsymbaliuk.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tsymbaliuk.dao.CategoryDAO;
import tsymbaliuk.model.Category;
import tsymbaliuk.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Цымбалюк Сергей on 04.09.2016.
 */
@Service
public class CategoryDaoImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addCategory(Category category){
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(category);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.getTransaction().commit();
            sessionFactory.close();
        }
    }

    @Override
    public void updateCategory(Category category) {
        Session session = sessionFactory.openSession();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(category);
            session.getTransaction().commit();
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            session.getTransaction().commit();
            sessionFactory.close();
        }
    }

    @Override
    public Category getCategoryById(int category_id)  {
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
    @SuppressWarnings("unchecked")
    public  List<Category> getAllCategories()  {
//        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        List<Category> categories = new ArrayList<>();
//        try {
//            session.beginTransaction();
//            categories=session.createCriteria(Category.class).list();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
////        finally {
////            session.getTransaction().commit();
////            sessionFactory.close();
////        }
//        return categories;
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(Category.class);
        return criteria.list();
    }


    @Override
    public void deleteCategory(Category category){
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(category);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.getTransaction().commit();
            sessionFactory.close();
        }
    }
}
