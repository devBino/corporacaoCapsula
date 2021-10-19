package br.com.bino.repositories.relacionamentos;

import java.text.MessageFormat;

public class Endereco {

	private String logradouro;
	private int numero;
	private String cidade;
	private String uf;
	
	public Endereco(String pLogradouro, int pNumero, String pCidade, String pUf) {
		logradouro = pLogradouro;
		numero = pNumero;
		cidade = pCidade;
		uf = pUf;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getUf() {
		return uf;
	}
	
	@Override
	public String toString() {
	
		MessageFormat txtEndereco = new MessageFormat("{0}, {1} - {2} - {3}");
		return txtEndereco.format(new Object[] {logradouro,numero,cidade,uf});
		
	}
	
}
