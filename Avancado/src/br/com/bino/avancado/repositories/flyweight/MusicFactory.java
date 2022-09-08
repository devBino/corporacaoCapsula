package br.com.bino.avancado.repositories.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicFactory {

	private static Map<String, Music> repository;
	private static MusicFactory instance;
	
	private MusicFactory() {
		
		repository = new HashMap<String, Music>();
		
		repository.put("Florentina", 
				new Music(new MusicFlyw("Florentina", "Tiririca", 150)));
		
		repository.put("India seus Cabelos", 
				new Music(new MusicFlyw("India seus Cabelos","Tiririca",230)));
		
		repository.put("Acorda Pedrino", 
				new Music(new MusicFlyw("Acorda Pedrinho", "Sei lá", 190)));
		
		repository.put("O Boi vai atrás", 
				new Music(new MusicFlyw("O Boi vai atrás", "Tiririca", 210)));
		
	}
	
	public static MusicFactory getInstance() {
		
		if(MusicFactory.instance == null) {
			MusicFactory.instance = new MusicFactory();
		}
		
		return instance;
		
	}
	
	public static Music getMusic(String musicaName) {
		return repository.get(musicaName);
	}
	
	public static Map<String, Music> getRepository(){
		return repository;
	}
	
}
