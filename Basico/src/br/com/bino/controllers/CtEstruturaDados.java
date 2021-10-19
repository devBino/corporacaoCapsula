package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

public class CtEstruturaDados extends ObjetoTeste {

	public CtEstruturaDados() {
		nomeTeste = TestesConstants.ESTRUTURAS_DADOS;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			dadosArray();
			dadosArrayComForOtimizado();
			dadosArrayMultidimensional();
			dadosArrayTresDimensoes();
			dadosArrayIrregular();
		}
		
	}
	
	public void dadosArray() {
		
		//criando estrutura de dados de alunos e notas
		String[] alunos = new String[5];
		
		alunos[0] = "fernando";
		alunos[1] = "edilaine";
		alunos[2] = "luis";
		alunos[3] = "leonardo";
		alunos[4] = "vagner";
		
		double[] notas = new double[5];
		
		notas[0] = 9.8;
		notas[1] = 8.4;
		notas[2] = 9.2;
		notas[3] = 9.6;
		notas[4] = 9.1;
		
		//capturando informações do primeiro aluno de dentro das estruturas arrays
		System.out.println( "Aluno: " + alunos[0] + " Nota: " + notas[0] );
		
		//capturando todos os alunos e notas dos arrays
		for(  int i=0; i<alunos.length; i++ ) {
			System.out.println( "Aluno: " + alunos[i] + " Nota: " + notas[i] );
		}
		
		System.out.println( linhaDivisao('_', (char) 60 ) );
		
	}
	
	public void dadosArrayComForOtimizado() {
		
		//cria estrutura de dados array para armazenar números
		int[] numeros = new int[5];
		
		numeros[0] = 10;
		numeros[1] = 12;
		numeros[2] = 43;
		numeros[3] = 32;
		numeros[4] = 34;
		
		//exibe todos os numeros do array com for melhorado
		for( int num : numeros ) {
			System.out.println("Número com for otimizado: " + num);
		}
		
		System.out.println( linhaDivisao('_', (char) 60 ) );
		
	}
	
	public void dadosArrayMultidimensional() {
		
		//criando estrutura de dados multidimensional
		String[][] notasAlunos = new String[3][3];
		
		notasAlunos[0][0] = "fernando";
		notasAlunos[0][1] = "9.8";
		notasAlunos[0][2] = "8.8";
		
		notasAlunos[1][0] = "adilson";
		notasAlunos[1][1] = "8.9";
		notasAlunos[1][2] = "9.3";
		
		notasAlunos[2][0] = "flavio";
		notasAlunos[2][1] = "9.1";
		notasAlunos[2][2] = "9.2";
		
		//resgatando e imprimindo primeira linha da matriz com dados do primeiro aluno
		System.out.println("\n\nRECUPERANDO DE MANEIRA MANUAL\n\n");
		System.out.println( "Aluno: " + notasAlunos[0][0] + " Nota 1: " + notasAlunos[0][1] + " Nota 2: " + notasAlunos[0][2] );
		
		
		System.out.println("\n\nRECUPERANDO COM FOR TRADICIONAL\n\n");
		
		//utilizando for tradicional para acessar dados na estrutura e imprimir no console
		for( int i=0; i<notasAlunos.length; i++ ) {
			
			System.out.println( "Aluno: " + notasAlunos[i][0] );
			
			for( int j=0; j<notasAlunos[i].length; j++ ) {	
				
				if( j == 0 ) {
					continue;
				}
				
				System.out.println("\tNota " + j + notasAlunos[i][j]);
				
			}
			
			System.out.println( linhaDivisao('*', (char) 30 ) );
			
		}
		
		System.out.println("\n\nRECUPERANDO COM FOR OTIMIZADO\n\n");
		
		//utilizando for otimizado para acessar dados na estrutura e imprimir no console
		for(String[] dadosAluno : notasAlunos) {
			
			System.out.println( "Aluno: " + dadosAluno[0] );
			
			for( String nota : dadosAluno ) {
				
				if( nota.equals(dadosAluno[0]) ) {
					continue;
				}
				
				System.out.println("\tNota " + nota);
				
			}
			
			System.out.println( linhaDivisao('*', (char) 30 ) );	
				
			
			
		}
		
		System.out.println( linhaDivisao('_', (char) 60 ) );
		
	}
	
	public void dadosArrayTresDimensoes() {
		
		//cria e preenche um array com 3 dimensões
		int[][][] numeros = new int[3][3][3];
		
		for( int i=0; i<numeros.length; i++ ) {

			for( int j=0; j<numeros[i].length; j++ ) {
				
				for( int k=0; k<numeros[i][j].length; k++ ) {
					numeros[i][j][k] = Integer.parseInt(
						String.valueOf(i) +
						String.valueOf(j) +
						String.valueOf(k)
					);
				}
				
			}
			
		}
		
		//captura um array dentro de uma posição do array numeros e joga em arr111
		int[] arr111 = numeros[1][1];
		
	}
	
	public void dadosArrayIrregular() {
		
		/*
		 * cria e preenche um array irregular,
		 * onde apenas sabemos que terá 5 nomes,
		 * porém não sabemos quantas palavras temos em cada nome
		 */
		String[][] nomes = new String[5][];
		
		nomes[0] = new String[3];
		nomes[0][0] = "fernando";
		nomes[0][1] = "bino";
		nomes[0][2] = "machado";
		
		nomes[1] = new String[2];
		nomes[1][0] = "ana";
		nomes[1][1] = "paula";
		
		nomes[2] = new String[3];
		nomes[2][0] = "adilson";
		nomes[2][1] = "de";
		nomes[2][2] = "souza";
		
		nomes[3] = new String[2];
		nomes[3][0] = "sergio";
		nomes[3][1] = "lopes";
		
		nomes[4] = new String[4];
		nomes[4][0] = "leonardo";
		nomes[4][1] = "prestes";
		nomes[4][2] = "nascimento";
		nomes[4][3] = "queiroz";
		
		//percorre o array, exibindo os nomes independente de seu tamanho
		StringBuilder builderNomes = new StringBuilder();
		
		for(int i=0;i<nomes.length;i++) {
			
			builderNomes.append("Nome => ");
			
			for(int j=0;j<nomes[i].length;j++) {
				
				builderNomes.append(nomes[i][j]);
				
				if( (j + 1) < nomes[i].length ) {
					builderNomes.append(" ");
				}
			}
			
			builderNomes.append("\n");
			
		}
		
		System.out.println(builderNomes.toString());
		
	}
	
	public void declararArrayDinamico() {

		//primeira maneira de declarar array dinamico
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		
		for( int n : numeros ) {
			System.out.println(n);
		}
		
		//segunda maneira de declarar array dinamico
		char[] letras = new char[] {'f','e','r'};
		
		for(char c : letras) {
			System.out.println(letras);
		}
		
	}
	
	
}