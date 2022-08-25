package com.vrnkaa.wordsrestservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "words_db")
public class Word {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "language")
    private String language;

    @Column(name = "word")
    private String word;

    @Column(name = "transcription")
    private String transcription;

    @Column(name = "part_of_speech")
    private String part_of_speech;

    @Column(name = "word_form_1")
    private String word_form_1;

    @Column(name = "word_form_2")
    private String word_form_2;

    @Column(name = "word_form_3")
    private String word_form_3;

    @Column(name = "example_1")
    private String example_1;

    @Column(name = "example_2")
    private String example_2;

    @Column(name = "example_3")
    private String example_3;

    @Column(name = "theme_group")
    private String theme_group;


    public Word() {
    }

}
