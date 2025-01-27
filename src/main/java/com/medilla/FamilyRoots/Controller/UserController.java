package com.medilla.FamilyRoots.Controller;

import com.medilla.FamilyRoots.DTO.UserDTO;
import com.medilla.FamilyRoots.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserService userService;
    @GetMapping("/Users/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Integer id) {
        UserDTO user =  userService.getUser(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/Users")
    public ResponseEntity<UserDTO> newUser(@RequestBody UserDTO user){
        return ResponseEntity.ok(user);
    }


}
