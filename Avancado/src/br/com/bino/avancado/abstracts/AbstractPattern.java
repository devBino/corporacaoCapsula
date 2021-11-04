package br.com.bino.avancado.abstracts;

import br.com.bino.avancado.constants.Constants;

public abstract class AbstractPattern {

	private String patternName;
	
	public AbstractPattern() {
		patternName = Constants.GENERIC;
	}
	
	public void callPattern() {
		badCode();
		cleanCode();
	}
	
	public abstract void badCode();
	public abstract void cleanCode();
	
	public void setPatternName(String pName) {
		patternName = pName;
	}
	
}
