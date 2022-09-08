package br.com.bino.avancado.ifaces.mediator;

import br.com.bino.avancado.repositories.mediator.ProcessaCalculo;

public interface ElementoCalculo {

	ElementoCalculo setMediator(ProcessaCalculo processaCalculo);
	ElementoCalculo setTipoElemento(char tipoElemento);
	char getTipoElemento();
	
	default ElementoCalculo setValor(int v) { return null; }
	default int getValor() { return 0; }
	default ElementoCalculo setSinal(char s) { return null; }
	default char getSinal() { return 0; }
	
}
