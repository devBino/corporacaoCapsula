package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.mediator.ProcessaCalculo;
import br.com.bino.avancado.repositories.mediator.Sinal;
import br.com.bino.avancado.repositories.mediator.Valor;

@PatternMap(patternName = Constants.P_MEDIATOR, call = true)
public class PMediator extends AbstractPattern {

	public PMediator() {
		super.setPatternName(Constants.P_MEDIATOR);
	}
	
	@Override
	public void cleanCode() {
	
		ProcessaCalculo processaCalculo = new ProcessaCalculo();
		
		Valor valor1 = new Valor()
				.setValor(25)
				.setTipoElemento('v');
		
		Valor valor2 = new Valor()
				.setValor(55)
				.setTipoElemento('v');
		
		Sinal sinal = new Sinal()
				.setSinal('+')
				.setTipoElemento('s');
		
		processaCalculo.setParametroCalculo(valor1);
		processaCalculo.setParametroCalculo(valor2);
		processaCalculo.setParametroCalculo(sinal);
		
		processaCalculo.efetuarCalculo();
		
		System.out.println("Resultado Teste 1: " + processaCalculo.getResultado());
		
		valor1.alterarValores(150, 60);
		sinal.alterarSinal('-');
		
		processaCalculo.efetuarCalculo();
		
		System.out.println("Resultado Teste 2: " + processaCalculo.getResultado());
		
	}
	
}
