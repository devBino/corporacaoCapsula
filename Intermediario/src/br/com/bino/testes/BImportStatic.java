package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;

//exemplos de import static
import static br.com.bino.constants.TestesConstants.IMPORT_STATIC;
import static java.lang.Math.pow;

public class BImportStatic extends TesteAbstract{

	public BImportStatic() {
		super.setNomeTeste(IMPORT_STATIC);
	}
	
	@Override
	public void teste() {

		if( testar ) {
			casoMath();
		}
		
	}
	
	/**
	 * o uso do import static
	 * permite importar funçoes, variaveis e constantes staticas 
	 * de classes, para que possamos chamar diretamente a funcao()
	 * ao invez de Classe.funcao()
	 * 
	 * @see
	 * 
	 * Math.pow(2,3); => pow(2,3);
	 * 
	 */
	public void casoMath() {

		//sem import static
		double n1 = Math.pow(2, 3);
		
		//utilizando import static java.lang.Math.pow no inicio dos imports
		double n2 = pow(2,3);
		
		linha();
		
	}
	
}
