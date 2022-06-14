package br.com.bino.avancado.repositories.simplefactory.calc;

import br.com.bino.avancado.ifaces.simplefactory.Calc;

public class Sum implements Calc {

	@Override
	public void calculator(int pValor1, int pValor2) {
		int r = pValor1 + pValor2;
		System.out.printf("Resultado Soma: %d%n",r);
	}
	
	@Override
	public void calculator(double pValor1, double pValor2) {
		double r = pValor1 + pValor2;
		System.out.printf("Resultado Soma: %10.2f%n",r);
	}
	
}
