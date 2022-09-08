package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.chain.responsability.Dispenser;

@PatternMap(patternName = Constants.P_CHAIN_OF_RESPONSABILITY, call = true)
public class PChainOfResponsability extends AbstractPattern {

	public PChainOfResponsability() {
		super.setPatternName(Constants.P_CHAIN_OF_RESPONSABILITY);
	}
	
	@Override
	public void cleanCode() {
	
		Dispenser dispenser = new Dispenser();
		
		dispenser.withDraw(1743);
		
		System.out.println("New test:");
		
		dispenser.withDraw(2679);
		
	}
	
}
