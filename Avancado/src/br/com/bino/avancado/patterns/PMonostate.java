package br.com.bino.avancado.patterns;

import java.util.Arrays;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.monostate.Car;
import br.com.bino.avancado.repositories.monostate.ListCars;

@PatternMap(patternName = Constants.P_MONOSTATE, call = true)
public class PMonostate extends AbstractPattern {

	public PMonostate() {
		super.setPatternName(Constants.P_MONOSTATE);
	}
	
	@Override
	public void callPattern() {
		super.callPattern();
	}
	
	@Override
	public void badCode() {
		//NA
	}
	
	@Override
	public void cleanCode() {
		
		testeListCars();
		
	}
	
	public static void testeListCars() {
	
		/**
		 * At this test we have three different
		 * instances to the ListCars object, but
		 * as we are applying Monostate pattern
		 * that is an alternative to the 
		 * Singleton pattern, the static attribute
		 * can be see with the same value
		 * to this three different instances.
		 */
		
		ListCars list1 = new ListCars();
		
		list1.setList(Arrays.asList(
			new Car("Fiat", "Palio", 4)
		));
		
		ListCars list2 = new ListCars();
		
		list2.setList(Arrays.asList(
			new Car("Wolkswagen", "Gol", 4)
		));
		
		ListCars list3 = new ListCars();
		
		list3.getList().stream()
			.forEach(carro -> System.out.println(carro));
		
	}
	
}
