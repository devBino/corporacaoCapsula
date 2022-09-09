package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.command.CacildsLight;
import br.com.bino.avancado.repositories.command.LightOff;
import br.com.bino.avancado.repositories.command.LightOn;
import br.com.bino.avancado.repositories.command.TabajaraLight;

@PatternMap(patternName = Constants.P_COMMAND, call = true)
public class PCommand extends AbstractPattern {

	public PCommand() {
		super.setPatternName(Constants.P_COMMAND);
	}
	
	@Override
	public void cleanCode() {
		
		//creating the light elements
		CacildsLight cacildsLight = new CacildsLight();
		TabajaraLight tabajaraLight = new TabajaraLight();
		
		//creating the commands
		LightOn lightOn = new LightOn(cacildsLight);
		LightOff lightOff = new LightOff(cacildsLight);
		
		//here we have the called to execute commands,
		//but is important to consider build a 
		//personal panel to send requests and then,
		//in another personal object execute this command
		lightOn.execute();
		System.out.println( "State of the " + cacildsLight.getClass().getSimpleName() + " = " +  cacildsLight.isOn() );
		
		lightOff.execute();
		System.out.println( "State of the " + cacildsLight.getClass().getSimpleName() + " = " +  cacildsLight.isOn() );
		
		lightOn.setElement(tabajaraLight);
		lightOff.setElement(tabajaraLight);
		
		lightOn.execute();
		System.out.println( "State of the " + tabajaraLight.getClass().getSimpleName() + " = " +  tabajaraLight.isOn() );
		
		lightOff.execute();
		System.out.println( "State of the " + tabajaraLight.getClass().getSimpleName() + " = " +  tabajaraLight.isOn() );
		
	}
	
}
