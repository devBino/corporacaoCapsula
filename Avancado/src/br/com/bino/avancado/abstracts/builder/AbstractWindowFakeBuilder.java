package br.com.bino.avancado.abstracts.builder;

import br.com.bino.avancado.repositories.builder.WindowFake;

public abstract class AbstractWindowFakeBuilder {

	protected WindowFake windowFake;
	
	protected int width;
	protected int height;
	protected int boardSymbol;
	protected int backgroundSymbol;
	
	public AbstractWindowFakeBuilder setWidth(int pWidth) {return this;}
	public AbstractWindowFakeBuilder setHeight(int pHeight) {return this;}
	public AbstractWindowFakeBuilder setBoardSymbol(int pBoardSymbol) {return this;}
	public AbstractWindowFakeBuilder setBackgroundSymbol(int pBackgroundSymbol) {return this;}
	
	public WindowFake builderWindowFake() {
		windowFake = new WindowFake(width, height, boardSymbol, backgroundSymbol);
		return windowFake;
	}
	
}
