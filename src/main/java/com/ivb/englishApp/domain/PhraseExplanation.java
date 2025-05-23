package com.ivb.englishApp.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class PhraseExplanation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phrase")
	private Phrase phrase;
	private long languageId;
	private String content;
	private String translate;
	private String linkVideo;
	 
	public PhraseExplanation() {
		super();
	}
	
	public PhraseExplanation( Phrase pharse, long languageId, String content, String translate, String linkVideo) {
		super();
		this.phrase = pharse;
		this.languageId = languageId;
		this.content = content;
		this.translate = translate;
		this.linkVideo = linkVideo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Phrase getPharseId() {
		return phrase;
	}
	public void setPharseId(Phrase pharseId) {
		this.phrase = phrase;
	}
	public long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(long languageId) {
		this.languageId = languageId;
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
	public String getLinkVideo() {
		return linkVideo;
	}
	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}
	
	
	

}
