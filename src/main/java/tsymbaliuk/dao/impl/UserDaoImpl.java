package tsymbaliuk.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tsymbaliuk.dao.UserDAO;
import tsymbaliuk.model.User;

/**
 * Created by Tsymbaliuk Serhii on 07.10.2016.
 */
@Service
public class UserDaoImpl implements UserDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void saveNewUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
