package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.interfaces.exemplos.DragaoComodo;
import br.com.bino.repositories.interfaces.exemplos.PintaSilga;

public class CtInterface extends ObjetoTeste{

	public CtInterface() {
		nomeTeste = TestesConstants.CLASSES_INTERFACES;
	}
	
	@Override
	public void teste() {
		
		if(testar) {
			exemploInterface();
		}
		
	}
	
	public void exemploInterface() {
		
		PintaSilga p = new PintaSilga();
		
		p.seMovimentar();
		p.cantar();
		p.comerAlpiste();
		
		System.out.println( linhaDivisao('_',(char) 60) );
		
		DragaoComodo d  = new DragaoComodo();
		
		d.seMovimentar();
		d.liberarVeneno();
		d.comerOvos();
		
		System.out.println( linhaDivisao('_',(char) 60) );
		
	}
	
}
