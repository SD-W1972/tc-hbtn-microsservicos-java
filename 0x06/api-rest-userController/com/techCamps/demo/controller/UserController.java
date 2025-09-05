package com.techCamps.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    public String findUserById(Long id){
        if(id > 0 && id < 100){
            return "You have entered valid ID";
        }
        return "You have entered invalid ID";
    }

    public String findUserByName(String name){
        if(name.length() > 3 && name.length() < 15){
            return "You have entered valid USERNAME";
        }
        return "You have entered invalid USERNAME";
    }


}
