package br.com.bino.avancado.repositories.adapter;

import br.com.bino.avancado.ifaces.adapter.HDMI;

public class Computer {

	private HDMI port;
	
	public void connectPort(HDMI screen) {
		System.out.println("Connecting on HDMI port");
		this.port = screen;
	}
	
	public void setImageAndSound(String image, String sound) {
	
		if(port == null) {
			System.out.println("Connecting a HDMI cable first...");
		}else {
			port.setImage(image);
			port.setSound(sound);
		}
		
	}
	
}
