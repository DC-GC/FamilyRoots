package com.medilla.FamilyRoots.Repository;

import com.medilla.FamilyRoots.Entity.User;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Repository
public class UserRepository {

    public User getUser(Integer id){

        return new User(1,"firstName", "hello", "world", new Timestamp (System.currentTimeMillis()));
    }
}
