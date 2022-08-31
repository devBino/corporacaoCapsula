package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.facade.CalculoFacade;

@PatternMap(patternName = Constants.P_FACADE, call = true)
public class PFacade extends AbstractPattern {

	public PFacade() {
		super.setPatternName(Constants.P_FACADE);
	}
	
	@Override
	public void cleanCode() {
	
		CalculoFacade calculoFacade = new CalculoFacade();
		
		calculoFacade.calcularSoma(20, 30, false);
		
	}
	
}
