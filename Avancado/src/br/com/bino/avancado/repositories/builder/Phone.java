package br.com.bino.avancado.repositories.builder;

public class Phone {

	private int number;
	private int ddd;
	
	public Phone(int pNumber, int pDdd) {
		number = pNumber;
		ddd = pDdd;
	}
	
	public int getNumber() {
		return number;
	}
	public int getDdd() {
		return ddd;
	}
	
}
