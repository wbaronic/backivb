package com.ivb.englishApp.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "questoes")
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String describe;
    private String optionA;
    private String optionB;
    private String correctOption;
    
    @OneToMany(mappedBy = "questao", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<QuestionExplanation> explanations;

    //@ManyToOne
    //@JoinColumn(name = "categoria_id")
    //private Categoria categoria;

//    @ManyToOne
//    @JoinColumn(name = "created_by")
//    private User createdBy;
    
    
    
    
    public Questao() {
		super();
	}

	public Questao(String describe, String optionA, String optionB, String correctOption) {
		super();
		this.describe = describe;
		this.optionA = optionA;
		this.optionB = optionB;
		this.correctOption = correctOption;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}

	public List<QuestionExplanation> getExplanations() {
		return explanations;
	}

	public void setExplanations(List<QuestionExplanation> explanations) {
		this.explanations = explanations;
	}


    // Getters e setters
    
    
}

