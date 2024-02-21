package com.jaminel.springsecurityjpa.service;

import com.jaminel.springsecurityjpa.models.User;
import com.jaminel.springsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        Optional<User> user= userRepository.findByUserName(username);
      user.orElseThrow(()-> new UsernameNotFoundException("notfound"+username));
        return user.map(MyUserDetailsIMPL::new).get();
    }
}
