package tsymbaliuk.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import tsymbaliuk.model.Product;
import tsymbaliuk.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Цымбалюк Сергей on 02.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Product> prosucts = new ArrayList<>();
        session.beginTransaction();
        Query query = session.createQuery("from Product");
        prosucts = (List<Product>) query.list();
        for (Product product:prosucts) {
            System.out.println(product.toString());
        }
        session.getTransaction().commit();
        sessionFactory.close();

    }

}
