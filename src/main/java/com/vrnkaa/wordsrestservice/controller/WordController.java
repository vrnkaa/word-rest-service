package com.vrnkaa.wordsrestservice.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @GetMapping("/")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/greetings")
    public String greetings(){
        return "Greetings";
    }

}
