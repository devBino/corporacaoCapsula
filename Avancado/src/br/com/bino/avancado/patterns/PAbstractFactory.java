package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.factory.iphone.Iphone;
import br.com.bino.avancado.repositories.factory.iphone.abstractfactory.BrazilianRulesAbstractFactory;
import br.com.bino.avancado.repositories.factory.iphone.abstractfactory.CountryRulesAbstractFactory;
import br.com.bino.avancado.repositories.factory.iphone.abstractfactory.UsRulesAbstractFactory;

@PatternMap(patternName = Constants.P_ABSTRACT_FACTORY, call = true)
public class PAbstractFactory extends AbstractPattern {
    
    public PAbstractFactory(){
        super.setPatternName(Constants.P_ABSTRACT_FACTORY);
    }

    @Override
    public void cleanCode() {
        
    	CountryRulesAbstractFactory brazilianRules = new BrazilianRulesAbstractFactory();
    	
    	Iphone iphoneBrazil = new Iphone(brazilianRules);
    	iphoneBrazil.aplyCountryRules();
    	
    	CountryRulesAbstractFactory usRules = new UsRulesAbstractFactory();
    	
    	Iphone iphoneUs = new Iphone(usRules);
    	iphoneUs.aplyCountryRules();
        
    }

}
