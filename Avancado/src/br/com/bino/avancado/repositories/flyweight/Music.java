package br.com.bino.avancado.repositories.flyweight;

public class Music {

	private MusicFlyw musicFlyw;
	private int likes;
	
	public Music(MusicFlyw musicFlyw) {
		this.musicFlyw = musicFlyw;
	}

	public MusicFlyw getMusicFlyw() {
		return musicFlyw;
	}

	public void setMusicFlyw(MusicFlyw musicFlyw) {
		this.musicFlyw = musicFlyw;
	}
	
	public void darLike() {
		likes ++;
	}
	
	public int getLikes() {
		return likes;
	}
	
	
}
