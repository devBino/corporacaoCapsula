package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.abstracts.showfiledir.AbstractShowFileDir;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;

import br.com.bino.avancado.ifaces.fatory.Message;
import br.com.bino.avancado.ifaces.fatory.Calc;

import br.com.bino.avancado.repositories.factory.showfiles.ShowFileDirSimpleFactory;

import br.com.bino.avancado.repositories.factory.calc.CalcFactory;
import br.com.bino.avancado.repositories.factory.calc.ECalc;
import br.com.bino.avancado.repositories.factory.calc.Sum;

import br.com.bino.avancado.repositories.factory.message.EMAILMessage;
import br.com.bino.avancado.repositories.factory.message.EMessage;
import br.com.bino.avancado.repositories.factory.message.MessageFactory;
import br.com.bino.avancado.repositories.factory.message.SMSMessage;

import br.com.bino.avancado.repositories.factory.showfiles.ShowFileDirLinux;
import br.com.bino.avancado.repositories.factory.showfiles.ShowFileDirWindows;

@PatternMap(patternName = Constants.P_SIMPLE_FACTORY_METHOD, call = true)
public class PSimpleFactoryMethod extends AbstractPattern {

	public PSimpleFactoryMethod() {
		super.setPatternName(Constants.P_SIMPLE_FACTORY_METHOD);
	}
	
	@Override
	public void callPattern() {
		super.callPattern();
	}
	
	@Override
	public void badCode() {
		
		badCodeSendMessage();
		badCodeShowDirFilesSO();
		
	}
	
	@Override
	public void cleanCode() {
		
		cleanCodeSendMessage();
		cleanCodeShowDirFilesSO();
		
	}
	
	public void badCodeSendMessage() {
		
		SMSMessage sms = new SMSMessage();
		sms.send("Sendind a test message by SMS");
		
		EMAILMessage email = new EMAILMessage();
		email.send("Sending a test message by EMAIL");
		
		Sum sum = new Sum();
		sum.calculator(10, 20);
		
	}
	
	public void badCodeShowDirFilesSO() {
		
		if( System.getProperty("os.name").contains("Windows") ) {
			
			ShowFileDirWindows showFileDirWindows = new ShowFileDirWindows();
			showFileDirWindows.showFiles();
			
		}else if( System.getProperty("os.name").contains("Linux") ) {
		
			ShowFileDirLinux showFileDirLinux = new ShowFileDirLinux();
			showFileDirLinux.showFiles();
			
		}
		
	}
	
	public void cleanCodeSendMessage() {
		
		//Message example
		Message sms = MessageFactory.getInstance(EMessage.SMS);
		sms.send("Sendind a test message by SMS");
		
		Message email = MessageFactory.getInstance(EMessage.EMAIL);
		email.send("Sending a test message by EMAIL");
		
		//Calculator example
		Calc soma = CalcFactory.getInstance(ECalc.SOMA);
		soma.calculator(23.56, 4545555.3);
		
	}
	
	public void cleanCodeShowDirFilesSO() {
		
		AbstractShowFileDir abstractShowFileDir = ShowFileDirSimpleFactory.getDomonstrator();
		abstractShowFileDir.showFiles();
	}
	
}
