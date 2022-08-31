package br.com.bino.avancado.repositories.adapter;

import br.com.bino.avancado.ifaces.adapter.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println( "This is your image: " + image );
	}
	
}
