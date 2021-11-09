package br.com.bino.avancado.repositories.factory.message;

import br.com.bino.avancado.ifaces.fatory.Message;

public class MessageFactory {

	public static Message getInstance(EMessage pType) {
		return pType.getInstance();
	}
	
}
