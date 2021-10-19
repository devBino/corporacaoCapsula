package br.com.bino.repositories;

public class CalculadoraRepository {

	private int valor1;
	private int valor2;
	
	public static double dbValor1;
	public static double dbValor2;
	
	public CalculadoraRepository() {
		valor1 = 0;
		valor2 = 0;
	}
	
	public CalculadoraRepository(int pValor1, int pValor2) {
		valor1 = pValor1;
		valor2 = pValor2;
	}
	
	public void setValor1(int pValor1) {
		valor1 = pValor1;
	}
	
	public void setValor2(int pValor2) {
		valor2 = pValor2;
	}
	
	public int somar() {
		int soma = valor1 + valor2;
		return soma;
	}
	
	public int somar(int pValor1, int pValor2) {
		int soma = pValor1 + pValor2;
		return soma;
	}
	
	public static double somar(double pValor1, double pValor2) {
		double soma = pValor1 + pValor2;
		return soma;
	}
	
}
