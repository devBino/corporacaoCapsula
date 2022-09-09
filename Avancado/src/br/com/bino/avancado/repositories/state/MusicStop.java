package br.com.bino.avancado.repositories.state;

import br.com.bino.avancado.ifaces.state.MusicState;

public class MusicStop implements MusicState {

	private static MusicState instance = new MusicStop();
	
	private MusicStop() {}
	
	public static MusicState getInstance() {
		return instance;
	}

	@Override
	public void click(Musica musica) {
		musica.setPlaying(false);
		musica.setState( MusicStart.getInstance() );
		System.out.println("Music is stoped. Click to Prepare and play the music...");
	}
	
	@Override
	public void dbClick(Musica musica) {
		
	}
	
}
