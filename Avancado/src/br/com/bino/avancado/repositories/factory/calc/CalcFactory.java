package br.com.bino.avancado.repositories.factory.calc;

import br.com.bino.avancado.ifaces.fatory.Calc;

public class CalcFactory {

	public static Calc getInstance(ECalc pType) {
		return pType.getInstance();
	}
	
}
