package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.singleton.ConnectionDBFake;

@PatternMap(patternName = Constants.P_SINGLETON, call = true)
public class PSingleton extends AbstractPattern {

	public PSingleton() {
		super.setPatternName(Constants.P_SINGLETON);
	}
	
	@Override
	public void callPattern() {
	
		/**
		 * Here, we have the problem because there's two
		 * ConnectionDBFake instances. So, it's a problem
		 * because we can't have two instances, we must to have one 
		 * instance only
		 */
		ConnectionDBFake con1 = new ConnectionDBFake();
		ConnectionDBFake con2 = new ConnectionDBFake();
		
		System.out.println(con1);
		System.out.println(con2);
		
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
