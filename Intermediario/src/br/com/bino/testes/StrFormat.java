package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.constants.TestesConstants;

public class StrFormat extends TesteAbstract {

	public StrFormat() {
		super.setNomeTeste(TestesConstants.STR_FORMAT);
	}
	
	@Override
	public void teste() {
	
		if( testar ) {
			exemplo1();
		}
		
	}
	
	public void exemplo1() {

		String d = String.format("%02d/", 1);
		
		System.out.println();
		
	}
	
}
