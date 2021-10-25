package br.com.bino.repositories.classaninhada;

public class Externa {

	public String texto = "Texto da clase extenra";
		
	public class Interna{
		
		public String texto = "Texto da classe interna";
		
		public void imprimeTexto() {
			
			System.out.println(texto);
			
			System.out.println(Externa.this.texto);
			
		}
		
		
		
	}
	
}
