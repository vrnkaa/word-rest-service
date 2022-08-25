package com.vrnkaa.wordsrestservice.controller;

import com.vrnkaa.wordsrestservice.model.Word;
import com.vrnkaa.wordsrestservice.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {
    @Autowired
    WordRepository wordRepository;

    @GetMapping("/words")
    public String listAll(Model model) {
        List<Word> listWords = wordRepository.findAll();
        model.addAttribute("listWords", listWords);

        return "words";
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/greetings")
    public String greetings() {
        return "Greetings";
    }

}
