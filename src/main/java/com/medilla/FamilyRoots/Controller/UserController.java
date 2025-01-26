package com.medilla.FamilyRoots.Controller;

import com.medilla.FamilyRoots.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserService userService;
    @GetMapping("/Users/{id}")
    public ResponseEntity<String> getUser(@PathVariable Integer id) {
        String user =  userService.getUser(id);
        return ResponseEntity.ok(user);
    }
}
