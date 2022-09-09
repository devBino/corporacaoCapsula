package br.com.bino.avancado.repositories.template.method;

import java.util.HashMap;
import java.util.Map;

import br.com.bino.avancado.ifaces.template.method.RegisterPersist;

public class CategoryDB {

	private static CategoryDB instance;
	private Map<Integer, RegisterPersist> listCategory;
	
	private CategoryDB() {
		listCategory = new HashMap<Integer, RegisterPersist>();
	}
	
	public static CategoryDB getInstance() {
		
		if(instance == null) {
			instance = new CategoryDB();
		}
		
		return instance;
		
	}
	
	public Map<Integer, RegisterPersist> getList() {
		return listCategory;
	}
	
}
