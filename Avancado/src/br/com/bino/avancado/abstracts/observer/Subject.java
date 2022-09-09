package br.com.bino.avancado.abstracts.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import br.com.bino.avancado.ifaces.observer.Observer;

public abstract class Subject {

	private List<Observer> peopleList = new ArrayList<Observer>();
	
	public void addPeople(Observer... people) {
		Stream.of(people).forEach(p -> {
			peopleList.add(p);
		});
	}
	
	public void notifyListPeople(boolean status) {
		
		peopleList.forEach(p -> {
			p.update(status);
		});
		
	}
	
}
