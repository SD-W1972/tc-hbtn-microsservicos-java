package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/messages")
public class MessageResource {

    @GetMapping("simpleMessageWelcome")
    public String simpleMessageWelcome(){
        return null;
    }
}
