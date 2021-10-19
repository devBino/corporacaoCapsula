package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

import br.com.bino.repositories.heranca.Programador;
import br.com.bino.repositories.heranca.Junior;
import br.com.bino.repositories.heranca.Pleno;

public class CtHeranca extends ObjetoTeste{

	public CtHeranca() {
		nomeTeste = TestesConstants.HERANCA;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			herancaProgramador();
		}
		
	}
	
	public void herancaProgramador() {
		
		Junior junior = new Junior("Java", "Invasão a Marte");
		junior.setNivel("Sonhador, Precisa estudar lógica de programação para abstrair coisas da vida real e trazer a vida real para o mundo da programação :)");
		
		Pleno pleno = new Pleno("PHP","Lutando para evoluir");
		pleno.setNivel("Realista, Manutenção, Sustentação e inovação em Sistema Legado :(");
		
		System.out.println(junior.toString());
		
		System.out.println( linhaDivisao('*', (char) 60) );
		
		System.out.println(pleno.toString());
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
}
