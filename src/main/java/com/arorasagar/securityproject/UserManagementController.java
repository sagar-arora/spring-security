package com.arorasagar.securityproject;

import com.arorasagar.securityproject.model.User;
import com.arorasagar.securityproject.service.InMemoryUserService;
import com.arorasagar.securityproject.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class UserManagementController {

    private static final User JAMES_BOND_USER = User.builder()
            .userId("1")
            .username("james.bond@gmail.com")
            .build();

    private static final User SAGAR_ARORA_USER = User.builder()
            .userId("1")
            .username("arora.sagar@gmail.com")
            .build();

    private static final List<User> USERS = Arrays.asList(
            JAMES_BOND_USER, SAGAR_ARORA_USER
    );

    UserService userService;
    public UserManagementController(UserService userService) {
        userService = new InMemoryUserService(USERS);
    }

    public List<User> getUsersList() {
        return USERS;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getUsers();
    }


    @PostMapping
    public User registerNewUser(User user) {
        userService.addNewUser(user);
        return user;
    }
}
