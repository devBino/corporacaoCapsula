package br.com.bino.avancado.repositories.template.method;

import java.util.HashMap;
import java.util.Map;

import br.com.bino.avancado.ifaces.template.method.RegisterPersist;

public class ProductsDB {

	private static ProductsDB instance;
	private Map<Integer, RegisterPersist> listProducts;
	
	private ProductsDB() {
		listProducts = new HashMap<Integer, RegisterPersist>();
	}
	
	public static ProductsDB getInstance() {
		
		if( instance == null ) {
			instance = new ProductsDB();
		}
		
		return instance;
		
	}
	
	public Map<Integer, RegisterPersist> getList(){
		return listProducts;
	}
	
}
