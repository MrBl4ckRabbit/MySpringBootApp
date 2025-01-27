package com.example.MySpringBootApp.service;


import com.example.MySpringBootApp.model.User;

import java.util.List;

public interface UserService {
    User getUser(int id);
    List<User> getUsers();
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
}
