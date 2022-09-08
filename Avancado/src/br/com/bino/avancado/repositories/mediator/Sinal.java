package br.com.bino.avancado.repositories.mediator;

import br.com.bino.avancado.ifaces.mediator.ElementoCalculo;

public class Sinal implements ElementoCalculo {

	private char valor;
	private ProcessaCalculo processaCalculo;
	private char tipoElemento;
	
	@Override
	public Sinal setMediator(ProcessaCalculo processaCalculo) {
		this.processaCalculo = processaCalculo;
		return this;
	}
	
	@Override
	public Sinal setTipoElemento(char tipoElemento) {
		this.tipoElemento = tipoElemento;
		return this;
	}
	
	@Override
	public char getTipoElemento() {
		return this.tipoElemento;
	}
	
	@Override
	public Sinal setSinal(char s) {
		this.valor = s;
		return this;
	}
	
	@Override
	public char getSinal() {
		return this.valor;
	}
	
	public void alterarSinal(char sinal) {
		processaCalculo.alterarSinal(sinal);
	}
	
}
