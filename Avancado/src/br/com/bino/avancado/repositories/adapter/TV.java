package br.com.bino.avancado.repositories.adapter;

import br.com.bino.avancado.ifaces.adapter.HDMI;

public class TV implements HDMI {

	@Override
	public void setImage(String image) {
		System.out.println( "This is your video: " + image );
	}
	
	@Override
	public void setSound(String sound) {
		System.out.println( "This is your sound: " + sound );
	}
	
}
