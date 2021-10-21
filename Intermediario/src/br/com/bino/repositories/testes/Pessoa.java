package br.com.bino.repositories.testes;

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
	
	public Pessoa(String pNome) {
		nome = pNome;
	}
	
	public void setGenero(char pLetra) {
		
		if( pLetra == 'm' || pLetra == 'M' ) {
			genero = Genero.MASCULINO;
		}else {
			genero = Genero.MASCULINO;
		}
		
	}
	
	public char getGenero() {
		return genero.getValor();
	}
	
	public String getNome() {
		return nome;
	}
	
}
