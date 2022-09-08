package br.com.bino.avancado.repositories.command;

import br.com.bino.avancado.ifaces.command.Command;
import br.com.bino.avancado.ifaces.command.GenericLight;

public class LightOff implements Command {

	private GenericLight light;
	
	@Override
	public void setElement(Object element) {
		light = (GenericLight) element; 
	}
	
	public LightOff(GenericLight light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOff();
	}
	
}
