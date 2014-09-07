package ru.home.fedr.services;

import ru.home.fedr.db.models.User;

public interface UserService {

    User loadUserByUsername(String username);
}
