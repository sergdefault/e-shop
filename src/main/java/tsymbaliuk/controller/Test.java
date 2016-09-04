package tsymbaliuk.controller;

import org.hibernate.Session;
import tsymbaliuk.model.Category;
import tsymbaliuk.util.HibernateUtil;

/**
 * Created by Цымбалюк Сергей on 02.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Category category = new Category();
//        category.setTitle("serg");
//        category.setDescription("tsymbaliuk");
//        session.save(category);
//        session.getTransaction().commit();
    }

}
