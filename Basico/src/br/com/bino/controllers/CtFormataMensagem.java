package br.com.bino.controllers;

import java.text.MessageFormat;
import br.com.bino.constants.TestesConstants;
import br.com.bino.iface.TesteObjeto;

public class CtFormataMensagem extends ObjetoTeste {

	public CtFormataMensagem() {
		nomeTeste = TestesConstants.FORMATA_MENSAGEM;
	}
	
	@Override
	public void teste() {
		
		if( testar ) {
		
			MessageFormat msg = new MessageFormat("{0} {1}");
			String newMsg = msg.format(new Object[] {"fernando","bino"});
			
			System.out.println( newMsg );
		
		}
		
	}
	
}
