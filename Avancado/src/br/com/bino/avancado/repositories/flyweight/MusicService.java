package br.com.bino.avancado.repositories.flyweight;

public class MusicService {

	public static void likeMusic(String name) {
		
		MusicFactory repository = MusicFactory.getInstance();
		
		Music music = repository.getMusic(name);
		
		if( music != null ) {
			music.darLike();
		}
		
	}
	
	public static void report() {
		
		System.out.println("Music Like Reports:\n");
		
		MusicFactory repository = MusicFactory.getInstance();
		
		for(String k : repository.getRepository().keySet()) {
			
			Music music = repository.getRepository().get(k);
			
			System.out.println("Music: " + music.getMusicFlyw().getName() 
					+ " Likes: " + music.getLikes());
			
		}
				
	}
	
}
