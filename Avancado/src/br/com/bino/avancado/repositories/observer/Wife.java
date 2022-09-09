package br.com.bino.avancado.repositories.observer;

import br.com.bino.avancado.ifaces.observer.Observer;

public class Wife implements Observer {

	public void partyTime() {
		System.out.println("Wife give a kiss and say: Let's party! :)");
	}
	
	@Override
	public void update(boolean status) {
		if(status) {
			partyTime();
		}else {
			System.out.println("Ooo shet!! :\\");
		}
	}
	
}
