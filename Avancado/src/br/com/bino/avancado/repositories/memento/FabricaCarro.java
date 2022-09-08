package br.com.bino.avancado.repositories.memento;

import br.com.bino.avancado.ifaces.memento.EtapaBuildCarro;

public class FabricaCarro {

	private StringBuilder historicoFabricacao = new StringBuilder();
	
	public EtapaBuildCarro save() {
		return new Etapa(historicoFabricacao.toString());
	}
	
	public void addHistoricoFabricacao(String descHistorico) {
		this.historicoFabricacao.append(descHistorico);
	}
	
	public String getHistorico() {
		return this.historicoFabricacao.toString();
	}
	
	public void restore(EtapaBuildCarro pEtapa) {
		
		historicoFabricacao.delete(0, historicoFabricacao.length());
		historicoFabricacao.append( pEtapa.getEtapa() );
	}
	
	private class Etapa implements EtapaBuildCarro{
		
		private StringBuilder descEtapas;
		
		public Etapa(String pDescEtapa) {
			descEtapas = new StringBuilder()
					.append(pDescEtapa);
		}
		
		public String getEtapa() {
			return this.descEtapas.toString();
		}
		
	}
	
}
