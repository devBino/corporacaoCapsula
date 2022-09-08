package br.com.bino.avancado.repositories.mediator;

import br.com.bino.avancado.ifaces.mediator.ElementoCalculo;

public class Valor implements ElementoCalculo {

	private int valor;
	private ProcessaCalculo processaCalculo;
	private char tipoElemento;
	
	@Override
	public Valor setMediator(ProcessaCalculo processaCalculo) {
		this.processaCalculo = processaCalculo;
		return this;
	}
	
	@Override
	public Valor setTipoElemento(char tipoElemento) {
		this.tipoElemento = tipoElemento;
		return this;
	}
	
	@Override
	public char getTipoElemento() {
		return this.tipoElemento;
	}
	
	@Override
	public Valor setValor(int v) {
		this.valor = v;
		return this;
	}
	
	@Override
	public int getValor() {
		return this.valor;
	}
	
	public void alterarValores(int valor1, int valor2) {
		processaCalculo.alterarValor1(valor1);
		processaCalculo.alterarValor2(valor2);
	}
	
}
