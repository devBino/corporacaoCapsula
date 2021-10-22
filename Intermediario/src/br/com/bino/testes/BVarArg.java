package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.constants.TestesConstants;

public class BVarArg extends TesteAbstract {

	public BVarArg() {
		super.setNomeTeste(TestesConstants.VAR_ARGS);
	}
	
	@Override
	public void teste() {
		
		if( testar ) {
			exemploVarArgs();
		}
		
	}
	
	public void exemploVarArgs() {

		somaArrayInt(new int[] {1,2,3,4,5});
		somaVarArgs(1,2,3,4,5);
		somaVarArgsAtencao("Fernando", 1,2,3,4,5);
		
	}
	
	public void somaArrayInt(int[] args) {
	
		int s = 0;
		
		for(int i : args) {
			s += i;
		}
		
		System.out.println("Soma: " + s);
		
	}
	
	public void somaVarArgs(Integer... args) {
		
		int s = 0;
		
		for(int i : args) {
			s += i;
		}
		
		System.out.println("Soma: " + s);
		
	}
	
	public void somaVarArgsAtencao(String nome, Integer... args) {
		
		int s = 0;
		
		for(int i : args) {
			s += i;
		}
		
		System.out.println(nome + " somou: " + s);
		
	}
	
}
