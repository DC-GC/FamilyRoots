package com.medilla.FamilyRoots.DTO;

import com.medilla.FamilyRoots.Entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Timestamp;

public class UserDTO {

    String Name;
    String Username;
    String Password;
    Timestamp CreatedOn;

    public void setName(String name) {
        Name = name;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) { Password = password; }

    public void setCreatedOn(Timestamp createdOn) {
        CreatedOn = createdOn;
    }

    public UserDTO UserMapper(User user) {
        this.setName(user.getName());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
        this.setCreatedOn(user.getCreatedOn());
        return this;
    }

    public String getName() {
        return Name;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public Timestamp getCreatedOn() {
        return CreatedOn;
    }
}
