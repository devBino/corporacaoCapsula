package br.com.bino.repositories.heranca;

import java.text.MessageFormat;

public class Pleno extends Programador {

	public Pleno(String pLinguagem, String pProjeto) {
		
		super(pLinguagem, pProjeto);
		
	}
	
	@Override
	public String getNivel() {
		
		MessageFormat msg = new MessageFormat("Programador Classe Pleno: {0}");
		return msg.format(new Object[] { nivel });
		
	}
	
}
