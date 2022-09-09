package br.com.bino.avancado.repositories.template.method;

import java.util.Map;

import br.com.bino.avancado.abstracts.template.method.ModelPersist;
import br.com.bino.avancado.ifaces.template.method.RegisterPersist;

public class CategoryPersist extends ModelPersist {

	@Override
	protected boolean preDelete(Map<Integer, RegisterPersist> dataList, int id) {
		
		ProductsDB productsDB = ProductsDB.getInstance();
		
		boolean categoryHasProducts = false;
		
		for(Integer pId : productsDB.getList().keySet()) {
			
			Product p = (Product) productsDB.getList().get(pId);
			
			if(p.getCategory().getId() == id) {
				categoryHasProducts = true;
				break;
			}
			
		}

		if(categoryHasProducts) {
			System.err.println("Não é possível deletar a categoria solicitada...");
		}
		
		return !categoryHasProducts;
		
	}
	
}
