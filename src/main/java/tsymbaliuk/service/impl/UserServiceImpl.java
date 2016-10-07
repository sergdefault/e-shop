package tsymbaliuk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tsymbaliuk.dao.UserDAO;
import tsymbaliuk.model.User;
import tsymbaliuk.service.UserService;

/**
 * Created by Tsymbaliuk Serhii on 07.10.2016.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public void saveNewUser(User user) {
        userDAO.saveNewUser(user);
    }
}
