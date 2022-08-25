package com.vrnkaa.wordsrestservice.repository;

import com.vrnkaa.wordsrestservice.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Integer> {
}
