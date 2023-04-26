package org.example;

import java.util.ArrayList;
import java.util.List;

public class Role {
    public String name; // public for simplicity
    private List<UserRole> userRoles = new ArrayList<>();

    public Role(String name) {
        this.name = name;
    }

    public void addUserRole(UserRole newUserRole) {
        // Check if we already have the info
        if(!userRoles.contains(newUserRole)) {
            userRoles.add(newUserRole);

            // Add the reverse connection
            newUserRole.addRole(this);
        }
    }
}
