package com.ivb.englishApp.domain;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", 
"handler"})
public class Phrase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String description;
	private int categoryId;
	private int createdBy;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="phrase")
	private Set<PhraseExplanation> explanations;
	 
	
	public Phrase() {
		super();
	}



	public Phrase(String description, int categoryId, int createdBy) {
		super();
		this.description = description;
		this.categoryId = categoryId;
		this.createdBy = createdBy;
		//this.explanations = explanations;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public int getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}



	public Set<PhraseExplanation> getExplanations() {
		return explanations;
	}



	public void setExplanationId(Set<PhraseExplanation> explanations) {
		this.explanations = explanations;
	}
	
	
	
	
  
}
