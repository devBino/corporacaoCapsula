package br.com.bino.avancado.repositories.decorator;

import br.com.bino.avancado.ifaces.decorator.Drink;

public class Expresso implements Drink {

	@Override
	public void serve() {
		System.out.println("Adding 100 ml of the \"Expresso Drink\" ");
	}
	
	@Override
	public Double getPrice() {
		return 5.99;
	}
	
}
