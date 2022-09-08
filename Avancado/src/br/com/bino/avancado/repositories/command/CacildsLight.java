package br.com.bino.avancado.repositories.command;

import br.com.bino.avancado.ifaces.command.GenericLight;

public class CacildsLight implements GenericLight {

	private boolean on;
	
	@Override
	public void turnOn() {
		on = true;
		System.out.println(this.getClass().getSimpleName() + " is running...");
	}
	
	@Override
	public void turnOff() {
		on = false;
		System.out.println(this.getClass().getSimpleName() + " is not running...");
	}
	
	@Override
	public boolean isOn() {
		return on;
	}
	
	
}
