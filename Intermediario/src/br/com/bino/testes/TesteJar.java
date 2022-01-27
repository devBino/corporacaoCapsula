package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

import app.Calculo;

@TesteMap(nomeTeste = TestesConstants.TESTE_JAR, testar = true)
public class TesteJar extends TesteAbstract{

	public TesteJar() {
		super.setNomeTeste(TestesConstants.TESTE_JAR);
	}
	
	@Override
	public void teste() {
	
		/**
		 * A classe abaixo vem de um jar,
		 * o objetivo com essa classe era apenas importar
		 * o jar e utilizá-lo nesse projeto
		 */
		Calculo c = new Calculo();
		
		c.v1 = 10;
		c.v2 = 20;
		
		System.out.println(c.somar());
		
	}
	
}
