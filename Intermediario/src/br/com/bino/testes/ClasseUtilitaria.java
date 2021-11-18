package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(nomeTeste = TestesConstants.CLASSE_UTILITARIA, testar = true)
public class ClasseUtilitaria extends TesteAbstract {

	public ClasseUtilitaria() {
		super.setNomeTeste(TestesConstants.CLASSE_UTILITARIA);
	}

	@Override
	public void teste() {
		
		/**
		 * @see 
		 * https://www.youtube.com/watch?v=341K_YKI6KQ&list=PLGxZ4Rq3BOBoqYyFWOV_YbfBW80YGAGEI&index=36&ab_channel=LoianeGroner
		 */
		
		System.out.println("oi");
		
	}
	
	
}
