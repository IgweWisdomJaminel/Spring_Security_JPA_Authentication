package com.jaminel.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class Controller {
    @GetMapping("/")
    public String welcome(){
        return ("<h1>Welcome</h1>");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome_Admin</h1>");
    }
    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome_User</h1>");
    }
}
