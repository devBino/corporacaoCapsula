package br.com.bino.avancado.repositories.mediator;

import br.com.bino.avancado.ifaces.mediator.ElementoCalculo;

public class ProcessaCalculo {

	private Integer valor1;
	private Integer valor2;
	private Character sinal;
	
	private Integer resultado;
	
	public void setParametroCalculo(ElementoCalculo element) {
		
		element.setMediator(this);
		
		if( element.getTipoElemento() == 's' ) {
			this.sinal = element.getSinal();
		}
		
		if( element.getTipoElemento() == 'v' && valor1 == null ) {
			this.valor1 = element.getValor();
		}else if( element.getTipoElemento() == 'v' && valor2 == null ) {
			this.valor2 = element.getValor();
		}
		
	}
	
	public void alterarValor1(int valor) {
		this.valor1 = valor;
	}
	
	public void alterarValor2(int valor) {
		this.valor2 = valor;
	}
	
	public void alterarSinal(char sinal) {
		this.sinal = sinal;
	}
	
	public void efetuarCalculo() {
		
		if( this.sinal == '+' ) {
			
			this.resultado = this.valor1 + this.valor2;
			
		}else if( this.sinal == '-' ) {
			
			this.resultado = this.valor1 - this.valor2;
			
		}else if( this.sinal == '/' ) {
			
			this.resultado = this.valor1 / this.valor2;
			
		}else if( this.sinal == '*' ) {
			
			this.resultado = this.valor1 * this.valor2;
			
		}
		
	}
	
	public Integer getResultado() {
		return this.resultado;
	}
	
}
