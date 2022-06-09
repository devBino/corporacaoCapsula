package br.com.bino.avancado.repositories.monostate;

import java.util.ArrayList;
import java.util.List;

public class ListCars {

	private static List<Car> list = new ArrayList<>();
	
	public ListCars() {
		
	}
	
	public void setList(List<Car> pList) {
		pList.stream()
			.forEach(car -> list.add(car));
	}

	public List<Car> getList(){
		return list;
	}
	
}
