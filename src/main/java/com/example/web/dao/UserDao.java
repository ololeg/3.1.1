package com.example.web.dao;

import com.example.web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
    void addUser(User user);
    void deleteById(Long id);
    User getUserById(Long id);
    void updateUser(User user);
}