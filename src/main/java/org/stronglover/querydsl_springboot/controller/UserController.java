package org.stronglover.querydsl_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.stronglover.querydsl_springboot.entity.User;
import org.stronglover.querydsl_springboot.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/search")
    public List<User> searchByName(@RequestParam String name) {
        return userService.findByName(name);
    }
}
