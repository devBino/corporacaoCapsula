package br.com.bino.avancado.repositories.memento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bino.avancado.ifaces.memento.EtapaBuildCarro;

public class HistoricoEtapasFabricaCarro {

	private List<EtapaBuildCarro> etapas = new ArrayList<EtapaBuildCarro>();
	
	public List<EtapaBuildCarro> getEtapas(){
		return Collections.unmodifiableList(etapas);
	}
	
	public void add(EtapaBuildCarro etapa) {
		etapas.add(etapa);
	}
	
	public EtapaBuildCarro get(int index) {
		return etapas.get(index);
	}
	
}
