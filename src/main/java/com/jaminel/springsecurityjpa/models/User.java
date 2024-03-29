package com.jaminel.springsecurityjpa.models;

import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = AUTO)
    private String userName;
    private String password;
    private String roles;
    private boolean active;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
