package br.com.bino.avancado.repositories.template.method;

import br.com.bino.avancado.ifaces.template.method.RegisterPersist;

public class Category implements RegisterPersist {

	private int id;
	private String name;
	
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
	
		return new StringBuilder()
				.append("Category[")
				.append("id=")
				.append(String.valueOf(id))
				.append(", ")
				.append("name=")
				.append(name)
				.append("]")
				.toString();
		
	}
	
}
