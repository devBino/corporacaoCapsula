package br.com.bino.avancado.repositories.observer;

import br.com.bino.avancado.abstracts.observer.Subject;

public class Doorman extends Subject {

	private boolean status;

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean newStatus) {
		
		if(status != newStatus) {
			status = newStatus;
			notifyListPeople(newStatus);
		}
		
	}
	
	
	
}
