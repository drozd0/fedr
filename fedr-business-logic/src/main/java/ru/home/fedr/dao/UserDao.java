package ru.home.fedr.dao;

import ru.home.fedr.db.models.User;

public interface UserDao {
    User loadUserByUsername(String username);
}
