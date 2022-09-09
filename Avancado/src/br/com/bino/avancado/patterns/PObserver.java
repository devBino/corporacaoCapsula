package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.observer.Doorman;
import br.com.bino.avancado.repositories.observer.Friend;
import br.com.bino.avancado.repositories.observer.Wife;

@PatternMap(patternName = Constants.P_OBSERVER, call = true)
public class PObserver extends AbstractPattern {

	public PObserver() {
		super.setPatternName(Constants.P_OBSERVER);
	}
	
	@Override
	public void cleanCode() {
	
		Doorman doorman = new Doorman();
		
		doorman.addPeople(new Wife(), new Friend());
		
		doorman.setStatus(true);
		doorman.setStatus(false);
		
	}
	
}
