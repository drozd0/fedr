package ru.home.fedr.dao;

import ru.home.fedr.db.repositories.UserRepository;
import ru.home.fedr.db.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User loadUserByUsername(String username) {
        return userRepository.findByEmail(username);
    }
}
