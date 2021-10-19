package br.com.bino.repositories;

import java.text.MessageFormat;

public class PessoaRepository {

	public String nome;
	public String genero;
	public byte idade;
	
	public void exibirDados() {
		
		String strBase = "Nome: {0}\nGenero: {1}\nIdade: {2}";
		MessageFormat strMsg = new MessageFormat(strBase);
		
		System.out.println( strMsg.format(new Object[] {nome,genero, idade}) );
		
	}
	
	public String retornarDados() {
		
		String strBase = "Nome: {0}\nGenero: {1}\nIdade: {2}";
		MessageFormat strMsg = new MessageFormat(strBase);
		
		return strMsg.format(new Object[] {nome,genero, idade});
		
	}
	
	public void setNome(String pNome) {
		nome = pNome;
	}
	
}
