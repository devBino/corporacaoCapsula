package br.com.bino.avancado.abstracts;

import br.com.bino.avancado.constants.Constants;

public abstract class AbstractPattern {

	private String patternName;
	
	public AbstractPattern() {
		patternName = Constants.GENERIC;
	}
	
	public abstract void callPattern();
	
	public void setPatternName(String pName) {
		patternName = pName;
	}
	
}
