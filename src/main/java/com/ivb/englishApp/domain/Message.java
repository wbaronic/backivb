package com.ivb.englishApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;

public class Message {
	Long id;
	String nome;
	@JsonIgnore
	Integer idUser;
	
	public Message(Long id, String nome, Integer idUser) {
		super();
		this.id = id;
		this.nome = nome;
		this.idUser = idUser;
	}

	public Message() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	
	
	
	

}
