package br.com.bino.repositories.heranca;

import java.text.MessageFormat;

public class Junior extends Programador {

	public Junior(String pLinguagem, String pProjeto) {
		
		super(pLinguagem, pProjeto);
		
	}
	
	@Override
	public String getNivel() {
		
		MessageFormat msg = new MessageFormat("Programador Classe Junior: {0}");
		return msg.format(new Object[] { nivel });
		
	}
	
}
