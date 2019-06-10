package com.pedro.getrimas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Palavra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cod;
	private String nome;
	
	public Palavra(int cod, String nome) {
		this.nome = nome;
		this.cod = cod;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
