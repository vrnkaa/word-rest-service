package com.vrnkaa.wordsrestservice.service;

import com.vrnkaa.wordsrestservice.model.Word;

import java.util.List;

public interface WordService {
    List<Word> findWord();
    Word findById(Long id);
}
