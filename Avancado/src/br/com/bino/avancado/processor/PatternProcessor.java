package br.com.bino.avancado.processor;

import java.util.ArrayList;
import java.io.File;
import java.lang.Class;

import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Configs;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.constants.enums.Erro;
import br.com.bino.avancado.exceptions.BinoException;
import br.com.bino.avancado.abstracts.AbstractPattern;

public class PatternProcessor {

	public static void runPatterns() throws BinoException {
		
		ArrayList<AbstractPattern> listPatterns =  getListPatterns();
		
		if( listPatterns.size() == 0 ) {
			throw new BinoException(Erro.E_001);
		}

		for( AbstractPattern p : listPatterns ) {
			p.callPattern();
		}
		
		
	}
	
	public static ArrayList<AbstractPattern> getListPatterns() {
		
		ArrayList<AbstractPattern> listPatterns = new ArrayList<AbstractPattern>();
		
		try {
		
			File fDir = new File(Configs.pathPatterns);
			File[] files = fDir.listFiles();
			
			for(File f : files) {
				
				String className = f.getName().replaceAll(".java", "");
				Class c = Class.forName(String.format("%s%s", Configs.packagePatterns,className));
				
				//case the pattern's not annotetad
				if( !c.isAnnotationPresent(PatternMap.class) ) {
					continue;
				}
				
				//case the member call is false
				PatternMap pt = (PatternMap) c.getAnnotation(PatternMap.class);
				
				if( !pt.call() ) {
					continue;
				}
				
				//verify if is a generic pattern or a specific pattern
				if( Constants.ACTIVE_PATTERN.equals(Constants.GENERIC) ) {
					
					listPatterns.add( (AbstractPattern) c.getDeclaredConstructor().newInstance() );
					
				}else if( pt.patternName().equals(Constants.ACTIVE_PATTERN) ) {
				
					listPatterns.add(  (AbstractPattern) c.getDeclaredConstructor().newInstance() );
					break;
					
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return listPatterns;
		
	}
	
}
