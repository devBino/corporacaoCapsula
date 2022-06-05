package br.com.bino.repositories.testes;

import br.com.bino.ifaces.Calculo;

public class CalculoLambda {

	private int resultado;
	
	public CalculoLambda(Calculo pCalculo) {
		resultado = pCalculo.calcular();
	}
	
	public int getResultado() {
		return resultado;
	}
	
}
