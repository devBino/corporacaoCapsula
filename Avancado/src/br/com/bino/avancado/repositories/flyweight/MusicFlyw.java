package br.com.bino.avancado.repositories.flyweight;

public class MusicFlyw {

	private String name;
	private String artist;
	private int duration;
	
	public MusicFlyw(String name, String artist, int duration) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		
		return new StringBuilder()
				.append("MusicFlyw [")
				.append("name=")
				.append(this.name)
				.append(", ")
				.append("artist=")
				.append(this.artist)
				.append(", ")
				.append("duration=")
				.append(String.valueOf(this.duration))
				.append("]")
				.toString();
		
	}
	
}
