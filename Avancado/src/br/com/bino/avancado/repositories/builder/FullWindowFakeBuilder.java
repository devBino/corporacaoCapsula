package br.com.bino.avancado.repositories.builder;

import br.com.bino.avancado.abstracts.builder.AbstractWindowFakeBuilder;

public class FullWindowFakeBuilder extends AbstractWindowFakeBuilder {

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
	
	@Override
	public AbstractWindowFakeBuilder setBoardSymbol(int pBoardSymbol) {
		this.boardSymbol = pBoardSymbol;
		return this;
	}
	
	@Override
	public AbstractWindowFakeBuilder setBackgroundSymbol(int pBackgroundSymbol) {
		this.backgroundSymbol = pBackgroundSymbol;
		return this;
	}
	
}
