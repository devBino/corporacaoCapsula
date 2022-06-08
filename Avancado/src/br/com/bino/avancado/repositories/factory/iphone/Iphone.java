package br.com.bino.avancado.repositories.factory.iphone;

import br.com.bino.avancado.repositories.factory.iphone.abstractfactory.CountryRulesAbstractFactory;

public class Iphone {
	
	private CountryRulesAbstractFactory countryRulesAbstractFactory;

	public Iphone(CountryRulesAbstractFactory pCountryRulesAbstractFactory) {
		countryRulesAbstractFactory = pCountryRulesAbstractFactory;
	}
	
	public void aplyCountryRules() {
		
		countryRulesAbstractFactory.getCertificate().applyCertificate();
		countryRulesAbstractFactory.getPacking().packing();
		
	}
	
}
