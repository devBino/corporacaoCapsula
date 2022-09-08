package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.memento.FabricaCarro;
import br.com.bino.avancado.repositories.memento.HistoricoEtapasFabricaCarro;

@PatternMap(patternName = Constants.P_MEMENTO, call = true)
public class PMemento extends AbstractPattern {

	public PMemento() {
		super.setPatternName(Constants.P_MEMENTO);
	}
	
	@Override
	public void cleanCode() {
	
		HistoricoEtapasFabricaCarro historico = new HistoricoEtapasFabricaCarro();
		
		FabricaCarro fabricaCarro = new FabricaCarro();
		
		fabricaCarro.addHistoricoFabricacao("Etapa 1 - Desenhando carro...\n");
		historico.add( fabricaCarro.save() );
		
		fabricaCarro.addHistoricoFabricacao("Etapa 2 - Comprando itens...\n");
		historico.add( fabricaCarro.save() );
		
		fabricaCarro.addHistoricoFabricacao("Etapa 3 - Soldando chassi...\n");
		historico.add( fabricaCarro.save() );
		
		fabricaCarro.restore( historico.get(1) );
		System.out.println(fabricaCarro.getHistorico());
		
		fabricaCarro.restore( historico.get(0) );
		System.out.println( fabricaCarro.getHistorico() );
		
		fabricaCarro.restore( historico.get(2) );
		System.out.println( fabricaCarro.getHistorico() );
		
	}
	
}
