package com.ivb.englishApp.domain;

import java.util.List;
import java.util.stream.Collectors;

public class QuestaoDTO {

    private Long id;
    private String describe;
    private String optionA;
    private String optionB;
    private String correctOption;
   // private List<QuestaoExplanationDTO> explanations;

    public QuestaoDTO(Questao questao) {
        this.id = questao.getId();
        this.describe = questao.getDescribe();
        this.optionA = questao.getOptionA();
        this.optionB = questao.getOptionB();
        this.correctOption = questao.getCorrectOption();
       // this.explanations = questao.getExplanations()
//                                    .stream()
//                                    .map(QuestaoExplanationDTO::new)
//                                    .collect(Collectors.toList());
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

  
    
}

