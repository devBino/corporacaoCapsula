package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;

@PatternMap(patternName = Constants.P_BUILDER, call = true)
public class PBuilder extends AbstractPattern {

	public PBuilder() {
		super.setPatternName( Constants.P_BUILDER );
	}
	
	@Override
	public void callPattern() {
	
		System.out.println("Make your codes here!!!");
		
	}
	
}
