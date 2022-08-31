package br.com.bino.avancado.repositories.decorator;

import br.com.bino.avancado.abstracts.decorator.DrinkDecorator;
import br.com.bino.avancado.ifaces.decorator.Drink;

public class DoubleDrink extends DrinkDecorator {

	public DoubleDrink(Drink drink) {
		super(drink);
	}
	
	@Override
	public void serve() {
		drink.serve();
		drink.serve();
	}
	
	@Override
	public Double getPrice() {
		return drink.getPrice() * 2;
	}
	
}
