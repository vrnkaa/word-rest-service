package com.vrnkaa.wordsrestservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Word {
    @Id
    private Integer id;
    private String language;
    private String word;
    private String transcription;
    private String part_of_speech;
    private String word_form_1;
    private String word_form_2;
    private String word_form_3;
    private String example_1;
    private String example_2;
    private String example_3;
    private String theme_group;

    
    public Word() {
    }

}
