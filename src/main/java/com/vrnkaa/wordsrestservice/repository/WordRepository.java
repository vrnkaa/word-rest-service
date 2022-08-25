package com.vrnkaa.wordsrestservice.repository;

import com.vrnkaa.wordsrestservice.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
}
