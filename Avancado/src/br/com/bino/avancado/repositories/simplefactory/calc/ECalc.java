package br.com.bino.avancado.repositories.simplefactory.calc;

import br.com.bino.avancado.ifaces.simplefactory.Calc;

public enum ECalc {

	SOMA{
		@Override
		public Calc getInstance() {
			return new Sum();
		}
	};
	
	public abstract Calc getInstance();
	
}
