package com.vrnkaa.wordsrestservice.service.impl;

import com.vrnkaa.wordsrestservice.model.Word;
import com.vrnkaa.wordsrestservice.service.WordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Override
    public List<Word> findWord() {
        return null;
    }

    @Override
    public Word findById(Long id) {
        return null;
    }
}
