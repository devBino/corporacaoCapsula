package br.com.bino.avancado.repositories.template.method;

import br.com.bino.avancado.ifaces.template.method.RegisterPersist;

public class Product implements RegisterPersist {

	private int id;
	private Category category;
	private String name;
	private double value;
	
	public Product() {}
	
	public Product(int id, Category category, String name, double value) {
		this.id = id;
		this.category = category;
		this.name = name;
		this.value = value;
	}

	@Override
	public int getId() {
		return id;
	}

	public Product setId(int id) {
		this.id = id;
		return this;
	}

	public Category getCategory() {
		return category;
	}

	public Product setCategory(Category category) {
		this.category = category;
		return this;
	}

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public double getValue() {
		return value;
	}

	public Product setValue(double value) {
		this.value = value;
		return this;
	}
	
	@Override
	public String toString() {
	
		return new StringBuilder()
				.append("Product[")
				.append("id=")
				.append(id)
				.append(", ")
				.append("category=")
				.append(category.toString())
				.append(", ")
				.append("name=")
				.append(name)
				.append(", ")
				.append("value=")
				.append(value)
				.append("]")
				.toString();
		
	}
	
	
}
