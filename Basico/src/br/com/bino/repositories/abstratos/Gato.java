package br.com.bino.repositories.abstratos;

public class Gato extends Animal {

	public Gato() {
		
	}
	
	public Gato(String pNome, String pTipo) {
		super(pNome, pTipo);
	}
	
	@Override
	public void movimentar() {
	
		System.out.println("O gato está andando em cima do muro e pulando nas arvores pra escapar do cachorro...");
		
	}
	
	@Override
	public void comer() {
		
		System.out.println("O gato está comendo suas wiscas e ronronando...");
		
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
