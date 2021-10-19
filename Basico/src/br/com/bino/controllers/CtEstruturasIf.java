package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

import java.util.Scanner;

public class CtEstruturasIf extends ObjetoTeste {

	public CtEstruturasIf() {
		nomeTeste = TestesConstants.ESTRUTURAS_IF;
	}
	
	@Override
	public void teste() {

		if(testar) {
			simples();
			composta();
			multipla();
		}
		
	}
	
	public void simples() {
		
		char idade = 19;
		
		if( idade >= 18  ) {
			System.out.println("É maior de idade...");
		}
		
	}
	
	public void composta() {
		
		char idade = 9;
		
		if( idade >= 18 ) {
			System.out.println("Adulto porra!!");
		}else {
			System.out.println("De menor, saia das fraudas!!!");
		}
		
	}
	
	public void multipla() {
		
		char idade = 5;
		
		if( idade >= 18 ) {
			System.out.println("Adulto porra!!");
		}else if( idade >= 12 && idade < 18 ) {
			System.out.println("Aborrecente, estude mais!!!");
		}else if( idade >= 7 && idade < 12 ) {
			System.out.println("Criança, estude mas apreveite bem!!!");
		}else if( idade >= 3 && idade < 7 ) {
			System.out.println("Jardim de infância, assista bastante desenhos...");
		}else {
			System.out.println("Bebe, talvez nasceu ontem...");
		}
		
	}
	
}
