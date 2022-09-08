package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.proxy.Bank;
import br.com.bino.avancado.repositories.proxy.BankProxy;

@PatternMap(patternName = Constants.P_PROXY, call = true)
public class PProxy extends AbstractPattern {
	
	public PProxy() {
		super.setPatternName(Constants.P_PROXY);
	}
	
	@Override
	public void cleanCode() {
	
		BankProxy bank1 = new BankProxy(new Bank(), "Fernando");
		
		bank1.deposit(100);
		bank1.withdraw(200);
		
		bank1.deposit(1000);
		bank1.deposit(2000);
		bank1.withdraw(501);
		
		
	}
	
}
