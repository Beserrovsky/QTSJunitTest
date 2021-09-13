package com.beserrovsky.locadora.models;

public class Cliente {

	private String Nome;
	
	public Cliente(String nome) {
		Nome = nome;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	@Override 
	public String toString() {
		return "Nome: " + Nome;
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		Cliente cli = (Cliente) obj;
		return Nome.contentEquals(cli.Nome);
	}

}
