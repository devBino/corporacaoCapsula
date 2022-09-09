package br.com.bino.avancado.abstracts.template.method;

import java.util.Map;

import br.com.bino.avancado.ifaces.template.method.RegisterPersist;

public abstract class ModelPersist {

	public void save(final Map<Integer, RegisterPersist> dataList, final RegisterPersist register, 
			final int id) {
		
		dataList.put(id, register);
		
	}
	
	public void delete(final Map<Integer, RegisterPersist> dataList, final int id) {
		
		if(preDelete(dataList, id)) {
			dataList.remove(id);
		}
		
	}
	
	protected boolean preDelete(final Map<Integer, RegisterPersist> dataList, final int id) {
		return true;
	}
	
}
