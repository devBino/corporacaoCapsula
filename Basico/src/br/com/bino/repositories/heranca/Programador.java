package br.com.bino.repositories.heranca;

public class Programador {

	protected String linguagem;
	protected String projeto;
	protected String nivel;
	
	public Programador(String pLinguagem, String pProjeto) {
		linguagem = pLinguagem;
		projeto = pProjeto;
		
		Bug b = new Bug();
		b.nomeBug = "bug teste";
	}
	
	public void setNivel(String pNivel) {
		if( pNivel != null ) {
			nivel = pNivel;
		}else {
			nivel = "Todo programador deve estar apto a analisar e resolver problemas...";	
		}
	}
	
	public String getNivel() {
		return nivel;
	}
	
	@Override
	public String toString() {
	
		return "Linguagem: "+linguagem+"\nProjeto: "+projeto+"\nNivel: "+nivel;
		
	}
	
}
