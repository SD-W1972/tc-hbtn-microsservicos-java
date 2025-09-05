package com.techCamps.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id){
        if(id > 0 && id < 100){
            return "You have entered valid ID";
        }
        return "You have entered invalid ID";
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String name){
        if(name.length() > 3 && name.length() < 15){
            return "You have entered valid USERNAME";
        }
        return "You have entered invalid USERNAME";
    }

    public String findUserByCPF(String cpf){
        if(cpf.length() > 3 && cpf.length() < 15){
            return "You have entered valid CPF";
        }
        return "You have entered invalid CPF";
    }
}
