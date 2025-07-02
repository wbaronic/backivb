package com.ivb.englishApp.domain;

import java.util.List;
import java.util.stream.Collectors;

public record QuestaoDTO(Long id,String describe,String optionA,String optionB,String correctOption) {

   // private List<QuestaoExplanationDTO> explanations;


    public QuestaoDTO {
    }

    public QuestaoDTO(Questao questao) {
        this(
                questao.getId(),
                questao.getDescribe(),
                questao.getOptionA(),
                questao.getOptionB(),
                questao.getCorrectOption()
                // questao.getExplanations()
                //       .stream()
                //       .map(QuestaoExplanationDTO::new)
                //       .collect(Collectors.toList())
        );
    }


  
    
}

