package br.com.bino.avancado.abstracts.decorator;

import br.com.bino.avancado.ifaces.decorator.Drink;

public abstract class DrinkDecorator implements Drink {

	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
	
}
