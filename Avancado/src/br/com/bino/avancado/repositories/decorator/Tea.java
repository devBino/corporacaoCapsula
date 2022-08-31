package br.com.bino.avancado.repositories.decorator;

import br.com.bino.avancado.ifaces.decorator.Drink;

public class Tea implements Drink {

	@Override
	public void serve() {
		System.out.println("Adding 50 ml of the \"Tea Drink\" ");
	}
	
	@Override
	public Double getPrice() {
		return 2.45;
	}
	
}
