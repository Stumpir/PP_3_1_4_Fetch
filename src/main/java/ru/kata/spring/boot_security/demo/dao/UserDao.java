package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    User getUser(Long id);
    void update(Long id, User user);
    void delete(Long id);
    User getByLogin(String login);
}
