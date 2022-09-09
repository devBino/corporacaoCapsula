package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.strategy.Adition;
import br.com.bino.avancado.repositories.strategy.Calculator;
import br.com.bino.avancado.repositories.strategy.Subtraction;

@PatternMap(patternName = Constants.P_STRATEGY, call = true)
public class PStrategy extends AbstractPattern {
	
	public PStrategy() {
		super.setPatternName(Constants.P_STRATEGY);
	}
	
	@Override
	public void cleanCode() {
	
		Calculator calculator = new Calculator(55, 34);
		
		System.out.println( "Adition result = " + calculator.getResult(new Adition()) );

		System.out.println( "Subtraction result = " + calculator.getResult(new Subtraction()) );
		
	}
	
}
