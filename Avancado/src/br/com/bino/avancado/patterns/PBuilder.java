package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;

import br.com.bino.avancado.repositories.builder.ContactBuilder;
import br.com.bino.avancado.repositories.builder.BasicWindowFakeBuilder;
import br.com.bino.avancado.repositories.builder.Contact;
import br.com.bino.avancado.repositories.builder.Phone;
import br.com.bino.avancado.repositories.builder.WindowFake;
import br.com.bino.avancado.repositories.builder.Email;
import br.com.bino.avancado.repositories.builder.FullWindowFakeBuilder;

@PatternMap(patternName = Constants.P_BUILDER, call = true)
public class PBuilder extends AbstractPattern {

	public PBuilder() {
		super.setPatternName( Constants.P_BUILDER );
	}
	
	@Override
	public void callPattern() {
		super.callPattern();
	}
	
	@Override
	public void badCode() {
		
		badCodeContact();
		
	}
	
	@Override
	public void cleanCode() {
		
		cleanCodeContact();
		cleanCodeWindowFake();
		
	}
	
	public void badCodeContact() {
		
		/**
		 * Here, we have a bad code,
		 * because needs to initialize many
		 * objects to compose a new Contact
		 */
		Contact c = new Contact();
		
		c.setName("Some One Marvel Comics");
		c.setStatus(true);
		
		Phone p1 = new Phone(8278299, 34);
		Phone p2 = new Phone(8278299, 34);
		c.getPhones().add(p1);
		c.getPhones().add(p2);
		
		Email e1 = new Email("spiderman@gmail.com", "gmail");
		Email e2 = new Email("ironman@gmail.com", "gmail");
		c.getEmails().add(e1);
		c.getEmails().add(e2);
		
		System.out.println(c.toString());
		
	}
	
	public void cleanCodeContact() {
		
		/**
		 * Now, here we have a Design Pattern Builder,
		 * where all things were simplified
		 */
		Contact c = new ContactBuilder()
				.setName("Iron Man")
				.setStatus(true)
				.addPhone(1234555, 41)
				.addPhone(3434554, 45)
				.addEmail("ironman@gmail.com", "gmail")
				.addEmail("peperpots@gmail.com", "gmail")
				.builder();
		
		System.out.println(c.toString());
		
	}
	
	public void cleanCodeWindowFake() {
		
		FullWindowFakeBuilder fullWindowBuilder = new FullWindowFakeBuilder();
		BasicWindowFakeBuilder basicWindowBuilder = new BasicWindowFakeBuilder();
		
		WindowFake fullWindow = fullWindowBuilder.setWidth(50)
									.setHeight(20)
									.setBoardSymbol('*')
									.setBackgroundSymbol('.')
									.builderWindowFake();
		
		WindowFake basicWindow = basicWindowBuilder.setWidth(50)
									.setHeight(20)
									.builderWindowFake();
		
		System.out.println(fullWindow);
		System.out.println(basicWindow);
		
		
	}
	
	
}
