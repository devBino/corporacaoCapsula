package br.com.bino.avancado.repositories.factory.message;

import br.com.bino.avancado.ifaces.simplefactory.Message;

public class SMSMessage implements Message {

	@Override
	public void send(String pMsg) {
		System.out.printf("Type: SMS%n");
		System.out.printf("Message: %s%n", pMsg);
	}
	
}
