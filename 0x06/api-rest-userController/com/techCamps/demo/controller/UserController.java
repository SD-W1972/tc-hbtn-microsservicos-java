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

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf){
        boolean isCPFValid = isCPF(cpf);

        return isCPFValid == true ? "You have entered valid CPF" : "You have entered invalid CPF";
    }

    public boolean isCPF(String CPF) {
        if(CPF.length() > 3 && CPF.length() < 15){
            return true;
        }
        return false;

    }
}
