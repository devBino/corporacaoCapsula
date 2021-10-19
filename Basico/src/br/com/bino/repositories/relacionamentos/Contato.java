package br.com.bino.repositories.relacionamentos;

import java.text.MessageFormat;

public class Contato {

	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
	private int qtdeTelefonesAdicionados;
	private int limiteTelefones = 10;
	
	public Contato() {
		qtdeTelefonesAdicionados = 0;
	}
	
	public Contato(String pNome, Endereco pEndereco) {
		nome = pNome;
		endereco = pEndereco;
		telefones = new Telefone[ limiteTelefones ];
		qtdeTelefonesAdicionados = 0;
	}
	
	public void setNome(String pNome) {
		nome = pNome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEndereco(Endereco pEndereco) {
		endereco = pEndereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void addTelefone(Telefone pTelefone) {
		telefones[qtdeTelefonesAdicionados] = pTelefone;
		qtdeTelefonesAdicionados = qtdeTelefonesAdicionados < (telefones.length - 1) ? qtdeTelefonesAdicionados + 1 : telefones.length - 1; 
	}
	
	public void removeTelefone(String pTelefone) {
		
		Telefone[] tels = new Telefone[telefones.length];
		
		int indiceTels = 0;
		
		for(int i=0;i<telefones.length;i++) {
			
			if( telefones[i] != null && telefones[i].getFone().equals( pTelefone ) ) {
				qtdeTelefonesAdicionados -= 1;
				continue;
			}
			
			tels[indiceTels] = telefones[i];
			indiceTels += 1;
			
		}
		
		telefones = tels;
		
	}
	
	@Override
	public String toString() {
	
		String txtBase = "Nome: \t\t{0}\nEndereço:\t{1}\nTelefones:{2}";
		StringBuilder txtTelefones = new StringBuilder(); 
		
		txtTelefones.append("\n");
		
		for(Telefone t : telefones) {
			
			if( t == null) {
				continue;
			}
			
			txtTelefones.append("\t\tDDD: ");
			txtTelefones.append(t.getDdd());
			txtTelefones.append(" Telefone: ");
			txtTelefones.append(t.getFone());
			txtTelefones.append("\n");
			
		}
		
		MessageFormat dados = new MessageFormat(txtBase);
		
		return dados.format(new Object[] {nome, endereco.toString(), txtTelefones.toString()});
		
	}
	

}
