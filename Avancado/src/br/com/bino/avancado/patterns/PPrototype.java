package br.com.bino.avancado.patterns;

import java.util.Arrays;
import java.util.List;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.constants.enums.Erro;
import br.com.bino.avancado.exceptions.BinoException;
import br.com.bino.avancado.repositories.prototype.Company;
import br.com.bino.avancado.repositories.prototype.Computer;
import br.com.bino.avancado.repositories.prototype.ComputerTools;

@PatternMap(patternName = Constants.P_PROTOTYPE, call = true)
public class PPrototype extends AbstractPattern {

	public PPrototype() {
		super.setPatternName(Constants.P_PROTOTYPE);
	}
	
	@Override
	public void cleanCode() {
		
		deepCopyExample();
		
	}
	
	public void deepCopyExample() {

		try {
			
			//creates a original Computer instance
			Computer initialComputer = new Computer(new ComputerTools());
			
			//creates another computer cloning the original instance
			Computer computerClone = (Computer) initialComputer.clone();
			
			//changes some fields of the new computer cloned
			computerClone.setColor("White");
			computerClone.setSo("Linux");
			computerClone.setYear(2010);
			computerClone.setPrice(2500.00);
			computerClone.setComputerTools(new ComputerTools());
			computerClone.getComputerTools().getTools().put("mouse", 59.99);
			computerClone.setCompany(new Company("PC Fake Entreteriments"));
			
			//showing two computers and them differences
			List<Computer> computers = Arrays.asList(initialComputer,computerClone);
			
			computers.forEach(c -> System.out.println(c));
			
		}catch(Exception error) {
			
			throw new BinoException(Erro.E_500);
			
		}

	}
	
}
