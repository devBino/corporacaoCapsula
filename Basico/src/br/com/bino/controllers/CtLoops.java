package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

public class CtLoops extends ObjetoTeste {

	public CtLoops() {
		nomeTeste = TestesConstants.ESTRUTURAS_LOOPS;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			fnFor();
			fnForMultiplasVariaveis();
			fnForSemCorpo();
			fnForBreak();
			fnForContinue();
			fnWhile();
			fnDoWhile();
			fnForEach();
		}
		
	}
	
	public void fnFor() {
		
		for( int i=0; i<10; i++ ) {
			System.out.println("Valor de i em fnFor " + i);
		}
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void fnForSemCorpo() {
		
		int soma = 0;
		
		for( int i=0; i<5; soma += i++ );
		
		System.out.println("Valor de soma: " + soma);
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void fnForMultiplasVariaveis() {
		
		for( int i=0, j=10; i < j; i++, j-- ) {
			System.out.println("Valor de i = " + i + " | Valor de j = " + j);
		}
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void fnForBreak() {
		
		for( int i=0; i<10; i++ ) {
			System.out.println("Valor de i em fnForBreak " + i);
			
			if( i == 5 ) {
				break;
			}
			
		}
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void fnForContinue() {
		
		for( int i=0; i<10; i++ ) {
			
			if( (i % 2) == 0 ) {
				continue;
			}
			
			System.out.println("Valor de i em fnForContinue " + i);
			
		}
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void fnWhile() {
		
		int i = 0;
		
		while(i < 10) {
			System.out.println("Valor de i em fnWhile " + i);
			i++;
		}
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void fnDoWhile() {
		int i = 10;
		
		do {
			System.out.println("Valor de i em fnDoWhile " + i);
			i++;
		}while(i < 10);
		
		System.out.println( linhaDivisao('_', (char) 60) );
	}
	
	public void fnForEach() {
		
		//criando array para guardar 5 numeros
		int[] numeros = new int[5];
		
		//povoando array
		int cont = 0;
		
		while(cont < numeros.length) {
			numeros[cont] = cont; 
			cont++;
		}
		
		//utilizando forEach para percorrer o array
		for(int n : numeros) {
			System.out.println(n);
		}
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
}
