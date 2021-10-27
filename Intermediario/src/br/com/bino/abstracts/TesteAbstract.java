package br.com.bino.abstracts;

import br.com.bino.constants.TestesConstants;

public abstract class TesteAbstract {

	protected String nomeTeste;
	
	public TesteAbstract() {
		nomeTeste = TestesConstants.ABSTRACT;
	}
	
	public abstract void teste();
	
	public void setNomeTeste(String pNomeTeste) {
		nomeTeste = pNomeTeste;
	}
	
	public String getNomeTeste() {
		return nomeTeste;
	}
	
	public void linha() {
		System.out.println("\n___________________________________________________\n");
	}
	
}
