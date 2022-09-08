package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.flyweight.MusicService;

@PatternMap(patternName = Constants.P_FLYWEIGHET, call = true)
public class PFlyweight extends AbstractPattern {

	public PFlyweight() {
		super.setPatternName(Constants.P_FLYWEIGHET);
	}
	
	@Override
	public void cleanCode() {
	
		MusicService.likeMusic("Florentina");
		
		MusicService.likeMusic("O Boi vai atrás");
		MusicService.likeMusic("O Boi vai atrás");
		
		MusicService.report();
		
	}
	
}
