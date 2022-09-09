package br.com.bino.avancado.repositories.state;

import br.com.bino.avancado.ifaces.state.MusicState;

public class Musica {

	private MusicState state;
	private boolean isPlaying;
	
	public Musica() {
		isPlaying = false;
		this.state = MusicStop.getInstance();
	}
	
	public boolean isPlaying() {
		return isPlaying;
	}
	
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	
	public void setState(MusicState state) {
		this.state = state;
	}
	
	public void click() {
		state.click(this);
	}
	
	public void dbClick() {
		state.dbClick(this);
	}
	
}
