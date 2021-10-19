package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.SobreEscritaRepository;

public class CtSobreEscrita extends ObjetoTeste {

	public CtSobreEscrita() {
		nomeTeste = TestesConstants.SOBRE_ESCRITA_METODOS;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			
			SobreEscritaRepository rpSob = new SobreEscritaRepository();
			
			if( rpSob.equals("cachorro") ) {
				System.out.println( "Igual..." );
			}else {
				System.out.println( "Diferente..." );
			}
			
		}
		
	}
	
}
