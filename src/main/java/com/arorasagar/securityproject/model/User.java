package com.arorasagar.securityproject.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class User {

    private String userId;

    private String username;

    private String firstName;

    private String lastName;

}
