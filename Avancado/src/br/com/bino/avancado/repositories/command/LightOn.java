package br.com.bino.avancado.repositories.command;

import br.com.bino.avancado.ifaces.command.Command;
import br.com.bino.avancado.ifaces.command.GenericLight;

public class LightOn implements Command {

	private GenericLight light;
	
	@Override
	public void setElement(Object element) {
		light = (GenericLight) element;
	}
	
	public LightOn(GenericLight light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOn();
	}
	
}
