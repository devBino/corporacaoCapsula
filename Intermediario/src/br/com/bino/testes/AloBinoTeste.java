package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.constants.TestesConstants;

public class AloBinoTeste extends TesteAbstract {

	public AloBinoTeste() {
		super.setNomeTeste(TestesConstants.ALO_BINO);
	}
	
	@Override
	public void teste() {
	
		if( testar ) {
			System.out.println("Alo bino!!");
		}
		
	}
	
}
