package br.com.bino.avancado.repositories.builder;

public class WindowFake {

	private int width;
	private int height;
	private int boardSymbol;
	private int backgroundSymbol;

	public WindowFake(int pWidth, int pHeight, int pBoardSymbol, int pBackgroundSymbol) {
		width = pWidth;
		height = pHeight;
		boardSymbol = pBoardSymbol;
		backgroundSymbol = pBackgroundSymbol;
	}

	public int getWith() {
		return width;
	}

	public void setWith(int pWidth) {
		this.width = pWidth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int pHeight) {
		this.height = pHeight;
	}

	public int getBoardSymbol() {
		return boardSymbol;
	}

	public void setBoardSymbol(int pBoardSymbol) {
		this.boardSymbol = pBoardSymbol;
	}

	public int getBackgroundSymbol() {
		return backgroundSymbol;
	}

	public void setBackgroundSymbol(int pBackgroundSymbol) {
		this.backgroundSymbol = pBackgroundSymbol;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("WindowFake [")
				.append("width = ")
				.append(String.valueOf(width))
				.append(", ")
				.append("height = ")
				.append(String.valueOf(height))
				.append(", ")
				.append("boardSymbol = ")
				.append(String.valueOf(boardSymbol))
				.append(", ")
				.append("backgroundSymbol = ")
				.append(String.valueOf(backgroundSymbol))
				.append("]")
				.toString();
	}
	
}
