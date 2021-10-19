package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

import br.com.bino.repositories.relacionamentos.Contato;
import br.com.bino.repositories.relacionamentos.Endereco;
import br.com.bino.repositories.relacionamentos.Telefone;

public class CtRelacionamentoClasse extends ObjetoTeste {

	public CtRelacionamentoClasse() {
		nomeTeste = TestesConstants.RELACIONAMENTO_CLASSES;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			exemploContatos();
		}
		
	}
	
	public void exemploContatos() {
		
		Endereco e1 = new Endereco("Rua Diogo Andrade Bello", 52, "Campo Largo", "PR");
		Contato c1 = new Contato("Fernando Bino Machado", e1);
		c1.addTelefone(new Telefone("041", "41997460578"));
		c1.addTelefone(new Telefone("1","123"));
		c1.addTelefone(new Telefone("041","36361549"));
		c1.removeTelefone("36361549");
		
		System.out.println( c1.toString() );
		
		System.out.println( linhaDivisao('_', (char) 60 ) );
		
	}
	
}
