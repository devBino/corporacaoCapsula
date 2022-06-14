package br.com.bino.avancado.repositories.factory.message;

import br.com.bino.avancado.ifaces.simplefactory.Message;

public enum EMessage {

	SMS{
		@Override
		public Message getInstance() {
			return new SMSMessage();
		}
	},
	EMAIL{
		@Override
		public Message getInstance() {
			return new EMAILMessage();
		}
	};
	
	public abstract Message getInstance();
	
}
