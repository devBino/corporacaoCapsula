package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;

import br.com.bino.avancado.ifaces.fatory.Message;
import br.com.bino.avancado.ifaces.fatory.Calc;
import br.com.bino.avancado.repositories.factory.calc.CalcFactory;
import br.com.bino.avancado.repositories.factory.calc.ECalc;
import br.com.bino.avancado.repositories.factory.calc.Sum;
import br.com.bino.avancado.repositories.factory.message.EMAILMessage;
import br.com.bino.avancado.repositories.factory.message.EMessage;
import br.com.bino.avancado.repositories.factory.message.MessageFactory;
import br.com.bino.avancado.repositories.factory.message.SMSMessage;

@PatternMap(patternName = Constants.P_FACTORY_METHOD, call = true)
public class PFactoryMethod extends AbstractPattern {

	public PFactoryMethod() {
		super.setPatternName(Constants.P_FACTORY_METHOD);
	}
	
	@Override
	public void callPattern() {
		super.callPattern();
	}
	
	@Override
	public void badCode() {
		
		SMSMessage sms = new SMSMessage();
		sms.send("Sendind a test message by SMS");
		
		EMAILMessage email = new EMAILMessage();
		email.send("Sending a test message by EMAIL");
		
		Sum sum = new Sum();
		sum.calculator(10, 20);
		
	}
	
	@Override
	public void cleanCode() {
		
		//Message example
		Message sms = MessageFactory.getInstance(EMessage.SMS);
		sms.send("Sendind a test message by SMS");
		
		Message email = MessageFactory.getInstance(EMessage.EMAIL);
		email.send("Sending a test message by EMAIL");
		
		//Calculator example
		Calc soma = CalcFactory.getInstance(ECalc.SOMA);
		soma.calculator(23.56, 4545555.3);
		
	}
	
}
