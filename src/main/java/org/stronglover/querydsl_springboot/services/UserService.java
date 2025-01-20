package org.stronglover.querydsl_springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stronglover.querydsl_springboot.entity.QUser;
import org.stronglover.querydsl_springboot.entity.User;
import org.stronglover.querydsl_springboot.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findByName(String name) {
        QUser user = QUser.user;
        return (List<User>) userRepository.findAll(user.name.eq(name));
    }
}
