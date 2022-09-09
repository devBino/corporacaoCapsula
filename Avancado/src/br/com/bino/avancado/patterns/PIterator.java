package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.iterator.TV;

@PatternMap(patternName = Constants.P_ITERATOR, call = true)
public class PIterator extends AbstractPattern {

	public PIterator() {
		super.setPatternName(Constants.P_ITERATOR);
	}
	
	@Override
	public void cleanCode() {
		
		TV tv = new TV();
		
		for(Integer channel : tv) {
			System.out.println(channel);
		}
		
	}
	
}
