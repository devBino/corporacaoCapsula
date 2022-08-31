package br.com.bino.avancado.repositories.facade;

public class CalculoFacade {

	private Soma soma;
	
	public CalculoFacade() {
		soma = new Soma();
	}
	
	public void calcularSoma(Object n1, Object n2, boolean precisao) {
		
		if(precisao) {
			soma.setnDouble1( Double.valueOf( n1.toString() ) );
			soma.setnDouble2( Double.valueOf( n2.toString() ) );
		}else {
			soma.setnInt1( Integer.valueOf( n1.toString() ) );
			soma.setnInt2( Integer.valueOf( n2.toString() ) );
		}
		
		soma.setPrecisao(precisao);

		soma.mostrarResultado();
		
	}
	
}
