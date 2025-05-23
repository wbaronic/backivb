package com.ivb.englishApp.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ivb.englishApp.domain.Phrase;

public class PhraseDTO {

    private Long id;
    private String phrase;
    private List<PhraseExplanationDTO> explanations;


    public PhraseDTO(Phrase phrase) {
        this.id = phrase.getId();
        this.phrase = phrase.getDescription();
        this.explanations = phrase.getExplanations() != null
                ? phrase.getExplanations().stream()
                       .map(PhraseExplanationDTO::new)
                       .collect(Collectors.toList())
                : List.of();
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getPhrase() {
        return phrase;
    }

	public List<PhraseExplanationDTO> getExplanations() {
		return explanations;
	}

	public void setExplanations(List<PhraseExplanationDTO> explanations) {
		this.explanations = explanations;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}
    
    
}

