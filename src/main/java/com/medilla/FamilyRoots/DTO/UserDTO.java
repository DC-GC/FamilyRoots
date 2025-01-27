package com.medilla.FamilyRoots.DTO;

import com.medilla.FamilyRoots.Entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Timestamp;

public class UserDTO {

    String name;
    String userName;
    String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public void setPassword(String password) { this.password = password; }


    public UserDTO UserMapper(User user) {
        this.setName(user.getName());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
        return this;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
