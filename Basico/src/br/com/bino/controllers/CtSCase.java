package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

import java.util.Scanner;

public class CtSCase extends ObjetoTeste {

	public CtSCase() {
		nomeTeste = TestesConstants.ESTRUTURA_S_CASE;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			
			diasDaSemana();
			testeFaixaIdade();
			
		}
		
	}
	
	public void diasDaSemana() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um dia da semana: ");
		
		int dia = scan.nextInt();
		
		switch(dia) {
		
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Dia de feira, vai trabalhar vagabundo...");
				break;
			case 1:
			case 7:
				System.out.println("Fim de semana, aproveita pra estudar...");
				break;
		
		}
		
		
	}
	
	public void testeFaixaIdade() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual sua idade? ");
		
		int faixa = getFaixaIdade( scan.nextByte() );

		switch(faixa) {
		
			case 1:
				System.out.println("Criança...");
				break;
			case 2:
				System.out.println("Adolescente...");
				break;
			case 3:
				System.out.println("Adulto...");
				break;
			case 4:
				System.out.println("Meia idade...");
				break;
			case 5:
				System.out.println("Quase velho...");
				break;
			case 6:
				System.out.println("Idoso...");
				break;
			default:
				System.out.println("Extraterrestre...");
				break;
		}
		
	}
	
	public int getFaixaIdade(byte v1) {
		
		if( v1 >= 0 && v1 <= 10 ) {
			return 1;
		}else if( v1 >= 11 && v1 <= 20 ) {
			return 2;
		}else if( v1 >= 21 && v1 <= 30 ) {
			return 3;
		}else if( v1 >= 31 && v1 <= 40 ) {
			return 4;
		}else if( v1 >= 41 && v1 <= 50 ) {
			return 5;
		}else {
			return 6;
		}
		
	}
	
}
