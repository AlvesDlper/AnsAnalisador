package com.ansanalyzer.entities;

public class Patient {

	
	private String nome;
	private Integer idade;
	private byte sexo;
	
	public Patient(String nome, Integer idade, byte sexo) {
		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public Patient () {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public byte getSexo() {
		return sexo;
	}
	public void setSexo(byte sexo) {
		this.sexo = sexo;
	}
	
	
	
}
