package br.com.bino.avancado.repositories.factory.calc;

import br.com.bino.avancado.ifaces.fatory.Calc;

public enum ECalc {

	SOMA{
		@Override
		public Calc getInstance() {
			return new Sum();
		}
	};
	
	public abstract Calc getInstance();
	
}
