package br.com.bino.avancado.ifaces.state;

import br.com.bino.avancado.repositories.state.Musica;

public interface MusicState {

	void click(Musica musica);
	void dbClick(Musica musica);
	
}
