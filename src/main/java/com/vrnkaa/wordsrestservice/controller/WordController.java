package com.vrnkaa.wordsrestservice.controller;

import com.vrnkaa.wordsrestservice.model.Word;
import com.vrnkaa.wordsrestservice.service.WordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/word")
public class WordController {

    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping
    public List<Word> findAllWord() {
        return wordService.findWord();
    }

    @GetMapping("/{id}")
    public Optional<Word> findWordById(@PathVariable("id") Long id) {
        return wordService.findById(id);
    }

}
