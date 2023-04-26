package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserRole {
    public String dateOfAcquiring;
    public String specialComments;
//    private List<User> users = new ArrayList<>();///z atrybutem
//    private List<Role> roles = new ArrayList<>();///z atrybutem
    private User user;
    private Role role;
//    public UserRole(String dateOfAcquiring, String specialComments) {
//        this.dateOfAcquiring = dateOfAcquiring;
//        this.specialComments = specialComments;
//    }

    public UserRole(User user1, Role role1, String dateOfAcquiring, String specialComments) {
        this.user = user1;
        this.role = role1;
        this.dateOfAcquiring = dateOfAcquiring;
        this.specialComments = specialComments;
    }


    public void addUser(User newUser) {
        // Check if we already have the info
//        if(!users.contains(newUser)) {
//            users.add(newUser);

            // Add the reverse connection
            newUser.addUserRole(this);
//        }
    }

    public void addRole(Role newRole) {
        // Check if we already have the info
//        if(!roles.contains(newRole)) {
//            roles.add(newRole);

            // Add the reverse connection
            newRole.addUserRole(this);
//        }
    }
}
