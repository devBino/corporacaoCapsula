package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(nomeTeste = TestesConstants.ALO_BINO, testar = true)
public class AloBinoTeste extends TesteAbstract {

	public AloBinoTeste() {
		super.setNomeTeste(TestesConstants.ALO_BINO);
	}
	
	@Override
	public void teste() {
	
		System.out.println("Alo bino!!");
		linha();
		
	}
	
}
