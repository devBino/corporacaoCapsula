package br.com.bino.repositories.testes;

public class EscopoVariavelRepository {

	private int valor;
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public int calculaValorEscopoLocal(int valor) {
		valor = valor + 10;
		return valor;
	}
	
	public int calculaValorEscopoClasse(int valor) {
		this.valor = valor + 10;
		return this.valor;
	}
	
	
}
