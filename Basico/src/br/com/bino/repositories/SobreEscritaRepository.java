package br.com.bino.repositories;

public class SobreEscritaRepository {

	public String nomeTeste;
	public String animal;
	
	public SobreEscritaRepository() {
		nomeTeste = "Teste de sobreescrita de metodos";
		animal = "macaco";
	}
	
	@Override
	public boolean equals(Object obj) {
	
		String pTeste = new String(String.valueOf(obj));
		
		return pTeste.equals( animal );
		
	}
	
	
}
