package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

import br.com.bino.repositories.abstratos.Cachorro;
import br.com.bino.repositories.abstratos.Gato;

public class CtClasseAbstrata extends ObjetoTeste {

	public CtClasseAbstrata() {
		nomeTeste = TestesConstants.CLASSES_ABSTRATAS;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			exemploClassesAbstratas();
		}
		
	}
	
	public void exemploClassesAbstratas() {
		
		Cachorro c = new Cachorro("Fofa", "Canino");
		c.movimentar();
		c.comer();
		
		System.out.println( linhaDivisao('*', (char) 60) );
		
		Gato g = new Gato("Poka","Felino");
		g.movimentar();
		g.comer();
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
}
