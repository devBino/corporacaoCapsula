package br.com.bino.avancado.repositories.state;

import br.com.bino.avancado.ifaces.state.MusicState;

public class MusicStart implements MusicState {

	private static MusicState instance = new MusicStart();
	
	private MusicStart() {}
	
	public static MusicState getInstance() {
		return instance;
	}
	
	@Override
	public void click(Musica musica) {
		musica.setPlaying(true);
		musica.setState(MusicPlaying.getInstance());
		System.out.println("Start and playing the music... If you want, you can click to pause...");
	}
	
	@Override
	public void dbClick(Musica musica) {
		
	}
	
}
