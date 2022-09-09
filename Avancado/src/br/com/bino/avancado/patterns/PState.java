package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.state.Musica;

@PatternMap(patternName = Constants.P_STATE, call = true)
public class PState extends AbstractPattern {

	public PState() {
		super.setPatternName(Constants.P_STATE);
	}
	
	@Override
	public void cleanCode() {
	
		Musica musica = new Musica();
		
		musica.click();
		musica.click();
		musica.click();
		musica.click();
		musica.click();
		musica.click();
		musica.dbClick();
		
	}
	
}
