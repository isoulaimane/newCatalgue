package com.socomoto.catalogue.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/test")
    public String test(){
        return "good job";
    }

    @GetMapping("/param")
    public String param(String t){
        return "Message bien reçu " + t;
    }


}
