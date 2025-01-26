package com.medilla.FamilyRoots.Service;

import com.medilla.FamilyRoots.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String getUser(Integer id){

        String user =  userRepository.getUser(id);
        return user;
    }
}
