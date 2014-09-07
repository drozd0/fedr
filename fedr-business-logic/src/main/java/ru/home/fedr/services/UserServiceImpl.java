package ru.home.fedr.services;

import ru.home.fedr.dao.UserDao;
import ru.home.fedr.db.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User loadUserByUsername(String username){
        return userDao.loadUserByUsername(username);
    }
}
