package br.com.bino.avancado.repositories.state;

import br.com.bino.avancado.ifaces.state.MusicState;

public class MusicPlaying implements MusicState {

	private static MusicState instance = new MusicPlaying();
	
	private MusicPlaying() {}
	
	public static MusicState getInstance() {
		return instance;
	}
	
	@Override
	public void click(Musica musica) {
		
		if( musica.isPlaying() ) {
			musica.setPlaying(false);
			System.out.println("Pause music...");
			return;
		}
		
		musica.setPlaying(true);
		System.out.println("Playing music...");
		
	}
	
	@Override
	public void dbClick(Musica musica) {
		musica.setState(MusicStop.getInstance());
		System.out.println("Stoping music :(");
	}
	
}
