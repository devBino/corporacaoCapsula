package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.singleton.ConnectionDBFake;
import br.com.bino.avancado.repositories.singleton.ConnectionDBFake2;

@PatternMap(patternName = Constants.P_SINGLETON, call = true)
public class PSingleton extends AbstractPattern {

	public PSingleton() {
		super.setPatternName(Constants.P_SINGLETON);
	}
	
	@Override
	public void callPattern() {
		super.callPattern();
	}

	@Override
	public void badCode() {
		
		/**
		 * Here, we have the problem because there's two
		 * ConnectionDBFake instances. So, it's a problem
		 * because we can't have two instances, we must to have one 
		 * instance only
		 */
		ConnectionDBFake2 con1 = new ConnectionDBFake2("First Connection");
		ConnectionDBFake2 con2 = new ConnectionDBFake2("Second Connection");
		
		System.out.println(con1);
		System.out.println(con2);
		
	}
	
	@Override
	public void cleanCode() {
		
		/**
		 * Here, we have a simple Singleton Pattern exemplo.
		 * Instead to call the constructor many times and
		 * use the word new new new new ...
		 * 
		 * We just use the static method getInstance() that 
		 * always returns a unic instance of this object
		 */
		ConnectionDBFake con10 = ConnectionDBFake.getInstance();
		ConnectionDBFake con20 = ConnectionDBFake.getInstance();
		
		System.out.println(con10);
		System.out.println(con20);
		
	}
	 
	
}
