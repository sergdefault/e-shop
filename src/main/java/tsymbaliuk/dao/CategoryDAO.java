package tsymbaliuk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import tsymbaliuk.model.Category;

import java.util.List;


/**
 * Created by Цымбалюк Сергей on 30.08.2016.
 */
public class CategoryDAO {
    private SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

    public List listCategory(){
        Session session = sessionFactory.openSession();
        Transaction transaction=null;

        transaction=session.beginTransaction();
        List category = session.createQuery("FROM Category").list();

        transaction.commit();
        session.close();
        return category;
    }

    public static void main(String[] args) {
        List list = new CategoryDAO().listCategory();
        for(Object category:list){
            Category cat = (Category) category;
            System.out.println(cat.toString());
        }
    }
}
