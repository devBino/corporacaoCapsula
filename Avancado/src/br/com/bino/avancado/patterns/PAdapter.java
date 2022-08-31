package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.adapter.Computer;
import br.com.bino.avancado.repositories.adapter.HDMIToVGAAdapter;
import br.com.bino.avancado.repositories.adapter.OldMonitor;
import br.com.bino.avancado.repositories.adapter.TV;

@PatternMap(patternName = Constants.P_ADAPTER, call = true)
public class PAdapter extends AbstractPattern {

	public PAdapter() {
		super.setPatternName(Constants.P_ADAPTER);
	}
	
	@Override
	public void cleanCode() {
		
		Computer cp1 = new Computer();
		TV tv = new TV();
		
		Computer cp2 = new Computer();
		OldMonitor oldMonitor = new OldMonitor();
		
		cp1.connectPort(tv);
		
		//cp2.connectPort(m2); //this doesn't works because connectPort wait for a 
		cp2.connectPort(new HDMIToVGAAdapter(oldMonitor));
		
		
		cp1.setImageAndSound("A Cat image", "A Cat sound");
		cp2.setImageAndSound("A Cat image 2", "A Cat sound 2");
		
	}
	
}
