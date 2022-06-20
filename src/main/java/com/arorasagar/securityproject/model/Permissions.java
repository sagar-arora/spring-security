package com.arorasagar.securityproject.model;

import lombok.Getter;

@Getter
public enum Permissions {
    USER_WRITE("USER:WRITE"),
    USER_READ("USER:READ");

    private final String permission;

    Permissions(String permission) {
        this.permission = permission;
    }
}
