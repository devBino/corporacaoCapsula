package br.com.bino.avancado.repositories.strategy;

import br.com.bino.avancado.ifaces.startegy.Operation;

public class Calculator {

	private int n1;
	private int n2;
	
	public Calculator(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int getResult(Operation operation) {
		return operation.calculate(n1, n2);
	}
	
}
