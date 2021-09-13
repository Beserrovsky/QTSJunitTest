package com.beserrovsky.locadora.models;

public class Jogo {

	private String Nome;
	private double Valor;
	private int QtdEstoque;
	

	public Jogo(String nome, double valor, int qtdestoque) {
		
		Nome = nome;
		Valor = valor; 
		QtdEstoque = qtdestoque; 
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public double getValor() {
		return Valor;
	}
	
	public void setValor(double valor) {
		Valor = valor;
	}
	
	public int getQtdEstoque() {
		return QtdEstoque;
	}
	
	public void setQtdEstoque(int qtdestoque) {
		QtdEstoque = qtdestoque;
	}

}
