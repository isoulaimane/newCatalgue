package com.socomoto.catalogue.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @GetMapping("/login")
    boolean login(String username, String pswd){
        if(username == null || username.isEmpty())
            return false;
        if (pswd == null || pswd.isEmpty())
            return false;
        return true;
    }
}
