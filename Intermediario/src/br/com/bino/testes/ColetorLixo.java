package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.testes.Pessoa;

@TesteMap(nomeTeste = TestesConstants.COLETOR_LIXO, testar = true)
public class ColetorLixo extends TesteAbstract {

	private final int MG;
	
	public ColetorLixo() {
		super.setNomeTeste(TestesConstants.COLETOR_LIXO);
		MG = 1024 * 1024;
	}
	
	@Override
	public void teste() {
		
		criarArrayPessoas();
		linha();
		
	}
	
	public void criarArrayPessoas() {
		
		Pessoa[] pessoas = new Pessoa[10000];
		
		for( int i=0; i<pessoas.length; i++ ) {
			pessoas[i] = new Pessoa("bino_"+i);
		}
		
		System.out.println("Pessoas criadas...");
		memoriaUtilizada();
		
		pessoas = null;
		
		/*
		 * solicita que o objeto criado seja finalizado com runFinalization()
		 * e depois, chama o garbage colector pra limpar a memória coletando o lixo
		 * na memória
		 */
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		
		System.out.println("Pessoas removidas da memória...");
		memoriaUtilizada();
		
	}
	
	
	public void memoriaUtilizada() {
		
		Runtime r = Runtime.getRuntime();
		long m = (r.totalMemory() - r.freeMemory()) / MG;
		
		System.out.println("Memória utilizada: " + m);
		
	}
}
