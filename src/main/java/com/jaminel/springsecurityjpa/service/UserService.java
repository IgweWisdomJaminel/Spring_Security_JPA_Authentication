package com.jaminel.springsecurityjpa.service;

import com.jaminel.springsecurityjpa.models.User;
import com.jaminel.springsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {

    final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User>findByUserName(String userName){
       Optional<User>user= userRepository.findByUserName(userName);
       return user;
    }
}
