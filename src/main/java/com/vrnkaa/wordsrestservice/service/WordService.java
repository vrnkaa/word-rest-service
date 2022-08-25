package com.vrnkaa.wordsrestservice.service;

import com.vrnkaa.wordsrestservice.model.Word;

import java.util.List;
import java.util.Optional;

public interface WordService {
    List<Word> findWord();
    Optional<Word> findById(Long id);
}
