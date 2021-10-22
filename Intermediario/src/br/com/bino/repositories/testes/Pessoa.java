package br.com.bino.repositories.testes;

import br.com.bino.repositories.enumeradores.TipoDocumento;

public class Pessoa {

	enum Genero {
		
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		Genero(char pValor){
			valor = pValor;
		}
		
		public char getValor() {
			return valor;
		}
		
	}
	
	private Genero genero;
	private String nome;
	private TipoDocumento tipoDocumento;
	private String numeroDocumento;
	
	public Pessoa(String pNome) {
		nome = pNome;
	}
	
	public void setGenero(char pLetra) {
		
		if( pLetra == 'm' || pLetra == 'M' ) {
			genero = Genero.MASCULINO;
		}else {
			genero = Genero.FEMININO;
		}
		
	}
	
	public char getGenero() {
		return genero.getValor();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setTipoDocumento(TipoDocumento pTipoDocumento) {
		tipoDocumento = pTipoDocumento;
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setNumeroDocumento(String pNumeroDocumento) {
		numeroDocumento = pNumeroDocumento;
	}
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	
	
	
}
