package com.arorasagar.securityproject.service;

import com.arorasagar.securityproject.model.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserService implements UserService {

    private final List<User> users;

    public InMemoryUserService() {
        this(new ArrayList<>());
    }

    public InMemoryUserService(List<User> users) {
        this.users = users;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addNewUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        for (User usr : users) {
            if (usr.equals(user)) {
                users.remove(user);
                break;
            }
        }
    }

    @Override
    public List<User> lookUpUser(String userId) {
        return null;
    }
}
