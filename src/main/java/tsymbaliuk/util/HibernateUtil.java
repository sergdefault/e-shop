package tsymbaliuk.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Цымбалюк Сергей on 31.08.2016.
 */
public class HibernateUtil {
    private static final Session session;
    static {
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() {
        return session;
    }
    public static void closeSession(){
        session.close();
    }
}
