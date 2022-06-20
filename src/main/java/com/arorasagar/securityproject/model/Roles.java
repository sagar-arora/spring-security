package com.arorasagar.securityproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum Roles {
    ADMIN("ADMIN"),
    USER("USER");

    private final String role;

    Roles(String role) {
        this.role = role;
    }
}
