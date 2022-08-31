package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.decorator.DoubleDrink;
import br.com.bino.avancado.repositories.decorator.Expresso;
import br.com.bino.avancado.repositories.decorator.Milk;
import br.com.bino.avancado.repositories.decorator.Tea;

@PatternMap(patternName = Constants.P_DECORATOR, call = true)
public class PDecorator extends AbstractPattern {

	public PDecorator() {
		super.setPatternName(Constants.P_DECORATOR);
	}
	
	@Override
	public void cleanCode() {
	
		Tea tea = new Tea();
		Milk milk = new Milk(tea);
		
		milk.serve();
		System.out.println( milk.getPrice() );
		
		Expresso expresso = new Expresso();
		DoubleDrink doubleDrink = new DoubleDrink(expresso);
		
		doubleDrink.serve();
		System.out.println(doubleDrink.getPrice());
		
	}
	
}
