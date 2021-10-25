package br.com.bino.repositories.classaninhada;

public class Anonima {

	public String texto = "qualquer texto...";
	
	public void imprimeTexto() {
		System.out.println(texto);
	}
	
	public static void main(String[] args) {
	
		Anonima a1 = new Anonima() {
			
			public void imprimeTexto() {
				System.out.println("qualquer texto sobre escrito...");
			}
			
		};
		
		a1.imprimeTexto();
		
	}
	
}
