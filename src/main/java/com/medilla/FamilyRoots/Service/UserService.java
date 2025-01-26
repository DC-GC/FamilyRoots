package com.medilla.FamilyRoots.Service;

import com.medilla.FamilyRoots.DTO.UserDTO;
import com.medilla.FamilyRoots.Entity.User;
import com.medilla.FamilyRoots.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public UserDTO getUser(Integer id){

        UserDTO userDTO = new UserDTO();
        return  userDTO.UserMapper(userRepository.getUser(id));
    }
}
