/**
 * @author Fernando Bino Machado
 * @description 
 * 		O presente projeto JavaIntermediario tem por objetivo
 *		ser um modelo estruturado para testar conceitos de forma
 *		organizada.
 *
 *		Isso evita a criação de diversos arquivos bagunçados
 *		espalhados em projetos, quando eram necessários
 *		apenas pequenos testes
 *		
 *		A lógica é simplis, o projeto permite que, sempre que 
 *		desejar fazer testes, por mais simplis que sejam,
 *		
 *		[1] Deverá ser implementado um teste padronizado no pacote br.com.bino.testes
 *		[2] Este deve extender de br.com.bino.abstracts.TesteAbstract
 *		[3] Deverá criar em br.com.bino.constants.TestesConstants, uma constante padronizada, 
 *				com nome do novo teste recém criado, deve ser o próprio nome 
 *				da classe de teste recém criada
 *		[4] No metodo construtor do teste, setar o atributo nome 
 *			do teste com a constant recém criada
 *		[5] No teste deverá ser sobreescrito o metodo public void teste() herdado de TesteAbstract
 *		[6] A classe de testes recém criada, deerá ser anotada assim
 *			
 *			@TesteMap(nomeTeste = TestesConstants.NOME_TESTE, testar = true)
 *
 *		
 */
package br.com.bino.app;

import br.com.bino.processor.TesteProcessor;

public class StartJavaIntermediario {

	public static void main(String[] args) {
		
		try {
			TesteProcessor.runTestes();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
