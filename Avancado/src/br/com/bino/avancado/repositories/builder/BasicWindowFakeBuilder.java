package br.com.bino.avancado.repositories.builder;

import br.com.bino.avancado.abstracts.builder.AbstractWindowFakeBuilder;

public class BasicWindowFakeBuilder extends AbstractWindowFakeBuilder {

	@Override
	public AbstractWindowFakeBuilder setWidth(int pWidth) {
		this.width = pWidth;
		return this;
	}
	
	@Override
	public AbstractWindowFakeBuilder setHeight(int pHeight) {
		this.height = pHeight;
		return this;
	}
	
}
