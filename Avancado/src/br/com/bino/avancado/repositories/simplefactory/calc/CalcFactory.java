package br.com.bino.avancado.repositories.simplefactory.calc;

import br.com.bino.avancado.ifaces.simplefactory.Calc;

public class CalcFactory {

	public static Calc getInstance(ECalc pType) {
		return pType.getInstance();
	}
	
}
