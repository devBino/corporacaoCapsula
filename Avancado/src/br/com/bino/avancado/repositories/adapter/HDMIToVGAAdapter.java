package br.com.bino.avancado.repositories.adapter;

import br.com.bino.avancado.ifaces.adapter.HDMI;
import br.com.bino.avancado.ifaces.adapter.VGA;

public class HDMIToVGAAdapter implements HDMI {

	private VGA vga;
	
	public HDMIToVGAAdapter(VGA vga) {
		System.out.println("Connecting to HDMI/VGA adapter...");
		this.vga = vga;
	}
	
	@Override
	public void setImage(String image) {
		System.out.println("Converting the image from HDMI to VGA...");
		vga.setImage(image);
	}
	
	@Override
	public void setSound(String sound) {
		System.out.println("Sorry, is not possible convert sound to VGA...");
	}
	
}
