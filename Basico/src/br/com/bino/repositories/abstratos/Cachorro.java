package br.com.bino.repositories.abstratos;

public class Cachorro extends Animal {

	public Cachorro() {
		
	}
	
	public Cachorro(String pNome, String pTipo) {
		super(pNome, pTipo);
	}
	
	@Override
	public void movimentar() {
	
		System.out.println("O cachorro está correndo e latindo para pegar o gato...");
		
	}
	
	@Override
	public void comer() {
		
		System.out.println("O cachorro está comendo sua ração purina dog show...");
		
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public String getTipo() {
		return tipo;
	}
	
}
