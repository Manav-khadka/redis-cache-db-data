package com.manav.redisimplementationdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/get-users")
    public ResponseEntity<List<Users>>getUsers() {
        List<Users> users = userService.getUsers();
        return ResponseEntity.ok().body(users);
    }
    @PostMapping("/add-users")
    public ResponseEntity<List<Users>>addUsers(@RequestBody List<Users> users) {
        List<Users> users1 = userService.addUsers(users);
        return ResponseEntity.ok().body(users1);
    }
}
