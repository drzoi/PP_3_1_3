package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    User getUserByUsername(String username);

    void updateUser(int id, User user);

    void removeUserById(int id);
    void registration(User user);
    void createUser(User user, String stringRole);
}
