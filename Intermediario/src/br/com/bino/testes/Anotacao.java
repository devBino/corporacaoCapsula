package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(
	nomeTeste=TestesConstants.ANOTACAO,
	tipo=TestesConstants.ANOTACAO,
	testar=true
)
public class Anotacao extends TesteAbstract {

	public Anotacao() {
		super.setNomeTeste(TestesConstants.ANOTACAO);
	}
	
	@Override
	public void teste() {
	
		if( testar ) {
			System.out.println("Por enquanto, verificar anotação no inicio da classe...");
		}
		
	}
	
}
