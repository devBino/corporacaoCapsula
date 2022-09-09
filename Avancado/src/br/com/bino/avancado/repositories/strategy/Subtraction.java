package br.com.bino.avancado.repositories.strategy;

import br.com.bino.avancado.ifaces.startegy.Operation;

public class Subtraction implements Operation {

	@Override
	public int calculate(int n1, int n2) {
		return n1 - n2;
	}
	
}
