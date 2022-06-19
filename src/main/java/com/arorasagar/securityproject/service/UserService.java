package com.arorasagar.securityproject.service;

import com.arorasagar.securityproject.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void addNewUser(User user);

    void removeUser(User user);

    List<User> lookUpUser(String userId);
}
