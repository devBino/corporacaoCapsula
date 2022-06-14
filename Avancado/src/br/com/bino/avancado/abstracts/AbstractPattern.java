package br.com.bino.avancado.abstracts;

import br.com.bino.avancado.constants.Constants;

public abstract class AbstractPattern {

	private String patternName;
	
	public AbstractPattern() {
		patternName = Constants.GENERIC;
	}
	
	public void callPattern() {
		
		System.out.println("-----------------------------------------------");
	
		System.out.println( String.format("Testing %s%n", patternName) );
		
		System.out.println("-----------------------------------------------\n");
		
		badCode();
		cleanCode();
		
		System.out.println("-----------------------------------------------\n");
		
	}
	
	public void badCode() {}
	public void cleanCode() {}
	
	public void setPatternName(String pName) {
		patternName = pName;
	}
	
}
