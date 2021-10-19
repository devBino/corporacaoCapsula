package br.com.bino.repositories.abstratos;

public abstract class Animal {

	protected String nome;
	protected String tipo;
	
	public Animal() {
		
	}
	
	public Animal(String pNome, String pTipo) {
		nome = pNome;
		tipo = pTipo;
	}
	
	public abstract void movimentar();
	public abstract void comer();
	
	public abstract String getNome();
	public abstract String getTipo();
	
}
