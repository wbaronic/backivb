package com.ivb.englishApp.domain;



import jakarta.persistence.*;

@Entity
@Table(name = "questao_explanation")
public class QuestionExplanation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String translate;
    private String video;
    private String language;

    @ManyToOne
    @JoinColumn(name = "questao")
    private Questao questao;

    // Getters e setters
}
