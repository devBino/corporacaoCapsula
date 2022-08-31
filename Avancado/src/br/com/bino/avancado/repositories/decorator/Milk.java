package br.com.bino.avancado.repositories.decorator;

import br.com.bino.avancado.abstracts.decorator.DrinkDecorator;
import br.com.bino.avancado.ifaces.decorator.Drink;

public class Milk extends DrinkDecorator {

	public Milk(Drink drink) {
		super(drink);
	}
	
	@Override
	public void serve() {
		drink.serve();
		System.out.println("Adding 30ml of the milk");
		
	}
	
	@Override
	public Double getPrice() {
		return drink.getPrice() + 1.5;
	}
	
}
