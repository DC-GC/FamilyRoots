package com.medilla.FamilyRoots.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.medilla.FamilyRoots.Entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Timestamp;

public class UserDTO {

    String name;
    String userName;
    String password;

//    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

//    @JsonProperty("UserName")
    public void setUsername(String username) {
        this.userName = username;
    }

//    @JsonProperty("Password")
    public void setPassword(String password) { this.password = password; }


    public UserDTO UserMapper(User user) {
        this.setName(user.getName());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
        return this;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("UserName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("Password")
    public String getPassword() {
        return password;
    }

}
