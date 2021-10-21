package br.com.bino.repositories.enumeradores;

public enum DiaFimSemana {

	SABADO(7), DOMINGO(1);
	
	private int valor;
	
	DiaFimSemana(int pValor){
		valor = pValor;
	}
	
	public int getValor() {
		return valor;
	}
	
}
