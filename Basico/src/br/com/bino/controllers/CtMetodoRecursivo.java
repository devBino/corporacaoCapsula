package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

public class CtMetodoRecursivo extends ObjetoTeste {

	public CtMetodoRecursivo() {
		nomeTeste = TestesConstants.RECURSIVIDADE;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			testeMetodos();
		}
		
	}
	
	public void testeMetodos() {
		
		int fatorial = calcFatorial(5);
		System.out.println("Resultado de Fatorial: " + fatorial);
		System.out.println( linhaDivisao('_', (char) 60 ) );
		
		contagemRegressiva(10);
		System.out.println( linhaDivisao('_', (char) 60 ) );
		
	}
	
	public int calcFatorial(int pNum) {
		
		if( pNum == 0 ) {
			return 1;
		}
		
		return pNum * calcFatorial(pNum - 1);
		
	}
	
	public void contagemRegressiva(int pNum) {
		
		if( pNum == 0 ) {
			System.out.println("Let's goooooooo!!!!!!");
		}else {
			System.out.println(pNum);
			contagemRegressiva(pNum - 1);
		}
		
	}
	
	
	
}
