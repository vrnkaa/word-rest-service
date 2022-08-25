package com.vrnkaa.wordsrestservice.service.impl;

import com.vrnkaa.wordsrestservice.model.Word;
import com.vrnkaa.wordsrestservice.repository.WordRepository;
import com.vrnkaa.wordsrestservice.service.WordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;

    public WordServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public List<Word> findWord() {
        return wordRepository.findAll();
    }

    @Override
    public Optional<Word> findById(Long id) {
        return wordRepository.findById(id);
    }
}
