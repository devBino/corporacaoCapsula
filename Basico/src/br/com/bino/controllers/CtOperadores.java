package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

public class CtOperadores extends ObjetoTeste {

	public CtOperadores() {
		nomeTeste = TestesConstants.OPERADORES_JAVA;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			aritimeticos();
			juntaTexto();
			incremento();
			decremento();
			relacionais();
			logicos();
			logicosCurtoCircuito();
		}
		
	}
	
	public void aritimeticos() {
		
		byte soma = 4 + 4;
		System.out.println("Soma => 4 + 4 = " + soma);
		
		byte subtracao = 4 - 3;
		System.out.println("Subtração => 4 - 3 = " + subtracao);
		
		byte multiplicacao = 4 * 7;
		System.out.println("Multiplicação => 4 * 7 = " + multiplicacao);
		
		byte divisao = 4 / 2;
		System.out.println("Divisão => 4 / 2 = " + divisao);
		
		byte restoDivisao = 4 % 3;
		System.out.println("Resto da Divisão => 4 % 3 = " + restoDivisao);
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void juntaTexto() {
		String nomeCompleto = "Fernando" + " Bino" + " Machado";
		System.out.println("Juntando 3 nomes no nome completo com operador + " );
		System.out.println("\"Fernando\" + \"Bino\" + \"Machado\" = \"" + nomeCompleto + "\"");
		System.out.println( linhaDivisao('_', (char) 60) );
	}
	
	public void incremento() {
		
		char numLetraA = 65;
		char numLetraB = 66;
		
		//incrementa e depois imprime
		System.out.println( (byte) ++numLetraA );
		
		//imprime depois incrementa
		System.out.println( (byte) numLetraB++ );
		
		char num1 = 10;
		char num2 = 10;
		
		//incrementa e depois avalia no if
		if( ++num1 > 10 ) {
			System.out.println( (byte) num1 + " Maior que 10!!" );
		}else {
			System.out.println( (byte) num1 + " Menor ou Igual a 10!!" );
		}
		
		//avalia no if e depois incrementa
		if( num2++ > 10 ) {
			System.out.println( (byte) num2 + " Maior que 10!!" );
		}else {
			System.out.println( (byte) num2 + " Menor ou Igual a 10!!" );
		}
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void decremento() {
		
		char numLetraB = 66;
		char numLetraA = 65;
		
		//decrementa e depois imprime
		System.out.println( (byte) --numLetraB );
		
		//imprime e depois decrementa
		System.out.println( (byte) numLetraA--  );
		
		char num1 = 10;
		char num2 = 10;
		
		//decrementa depois avalia no if
		if( --num1 < 10 ) {
			System.out.println( (byte) num1 + " Menor que 10!!" );
		}else {
			System.out.println( (byte) num1 + " Maior ou Igual a 10!! " );
		}
		
		//avalia no if e depois decrementa
		if( num2-- < 10 ) {
			System.out.println( (byte) num2 + " Menor que 10!!" );
		}else {
			System.out.println( (byte) num2 + " Maior ou Igual a 10!!" );
		}
		
		System.out.println( linhaDivisao('_', (char) 60 ) );
		
	}
	
	public void relacionais() {
		
		byte num1 = 10;
		byte num2 = 11;
		
		//igualdade
		if( num1 == 10 ) {
			System.out.println(num1 + " igual a " + 10);
		}
		
		//diferença
		if( num1 != num2 ) {
			System.out.println(num1 + " diferente de " + num2);
		}
		
		//maior que
		if( num2 > num1 ) {
			System.out.println(num2 + " maior que " + num1);
		}
		
		//menor que
		if( num1 < num2 ) {
			System.out.println(num1 + " menor que " + num2);
		}
		
		//maior ou igual a
		if( num2 > num1 ) {
			System.out.println(num2 + " maior ou igual a " + num1);
		}
		
		//menor ou igual a
		if( num1 < num2 ) {
			System.out.println(num1 + " menor ou igual a " + num2);
		}
		
		System.out.println( linhaDivisao('_', (char) 60 ) );
	}
	
	public void logicos() {
		
		byte num1 = 1;
		byte num2 = 2;
		
		//todas as expressões lógicas avaliadas devem resultar em true
		boolean operE = (num1 == 1) && (num2 == 2);
		//apenas uma dentre as expressões logicas deve resultar em true
		boolean operOr = (num1 == 1) || (num2 == 3);
		//as expressões lógicas devem ser diferentes, true e false ou vice versa
		boolean operXor = (num1 == 1) ^ (num2 == 3);
		//nega, invertendo de true para false e de false para true
		boolean operNegacao = (num1 == 2) || !(num2 == 3);
		
		System.out.println(operE);
		System.out.println(operOr);
		System.out.println(operXor);
		System.out.println(operNegacao);
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void logicosCurtoCircuito() {
		
		//operador E simplis, avalia sempre todas as expressões
		if( teste1(false) & teste2(true) ) {
			System.out.println("teste verdadeiro");
		}else {
			System.out.println("teste false");
		}
		
		/**
		 * operador E curto circuito, ao encontrar um primeiro false
		 * na avaliação de expressões, o ele nem tenta avaliar a próxima 
		 * expressão, porque já sabe que por ser E, precisa de ambas verdadeiras
		 * e como encontrou uma falsa de antemão, encerra as avaliações
		 */
		if( teste1(false) && teste2(true) ) {
			System.out.println("teste verdadeiro");
		}else if( teste1(true) && teste2(false) ) {
			System.out.println("teste verdadeiro");
		}else {
			System.out.println("teste false");
		}
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public boolean teste1(boolean pValor) {
		return pValor;
	}
	
	public boolean teste2(boolean pValor) {
		return pValor;
	}
	
	
}
