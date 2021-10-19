package br.com.bino.repositories.relacionamentos;

public class Telefone {

	private String ddd;
	private String fone;
	
	public Telefone(String pDdd, String pFone) {
		ddd = pDdd;
		fone = pFone;
	}
	
	public String getDdd() {
		return ddd;
	}
	
	public String getFone() {
		return fone;
	}
	
}
