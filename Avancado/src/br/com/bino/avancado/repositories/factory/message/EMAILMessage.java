package br.com.bino.avancado.repositories.factory.message;

import br.com.bino.avancado.ifaces.fatory.Message;

public class EMAILMessage implements Message{

	@Override
	public void send(String pMsg) {
		System.out.printf("Type: EMAIL%n");
		System.out.printf("Message: %s%n", pMsg);	
	}
	
	
}
