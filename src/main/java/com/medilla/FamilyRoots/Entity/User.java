package com.medilla.FamilyRoots.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class User {

    @Id
    Integer AccountNumber;
    String Name;
    String Username;
    String Password;
    Timestamp CreatedOn;

    public User(Integer accountNumber, String name, String username, String password, Timestamp createdOn) {
        AccountNumber = accountNumber;
        Name = name;
        Username = username;
        Password = password;
        CreatedOn = createdOn;
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
