package com.ivb.englishApp.dto;

import com.ivb.englishApp.domain.PhraseExplanation;

public class PhraseExplanationDTO {

    private String content;
    private String translate;
    private String video;
    private String language;

    public PhraseExplanationDTO(PhraseExplanation explanation) {
        this.content = explanation.getContent();
        this.translate = explanation.getTranslate();
        this.video = explanation.getLinkVideo();
        this.language = Long.toString(explanation.getLanguageId())  ;
    }

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTranslate() {
		return translate;
	}

	public void setTranslate(String translate) {
		this.translate = translate;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
    
    

}
