package br.com.bino.avancado.repositories.facade;

import br.com.bino.avancado.ifaces.facade.Calculo;

class Soma implements Calculo {

	private int nInt1;
	private int nInt2;
	private double nDouble1;
	private double nDouble2;
	
	private boolean precisao;
	
	Soma(){}
	
	Soma(int n1, int n2){
		this.nInt1 = n1;
		this.nInt2 = n2;
	}
	
	Soma(double n1, double n2){
		this.nDouble1 = n1;
		this.nDouble2 = n2;
	}
	
	/**
	 * @return the nInt1
	 */
	public int getnInt1() {
		return nInt1;
	}

	/**
	 * @param nInt1 the nInt1 to set
	 */
	public void setnInt1(int nInt1) {
		this.nInt1 = nInt1;
	}

	/**
	 * @return the nInt2
	 */
	public int getnInt2() {
		return nInt2;
	}

	/**
	 * @param nInt2 the nInt2 to set
	 */
	public void setnInt2(int nInt2) {
		this.nInt2 = nInt2;
	}

	/**
	 * @return the nDouble1
	 */
	public double getnDouble1() {
		return nDouble1;
	}

	/**
	 * @param nDouble1 the nDouble1 to set
	 */
	public void setnDouble1(double nDouble1) {
		this.nDouble1 = nDouble1;
	}

	/**
	 * @return the nDouble2
	 */
	public double getnDouble2() {
		return nDouble2;
	}

	/**
	 * @param nDouble2 the nDouble2 to set
	 */
	public void setnDouble2(double nDouble2) {
		this.nDouble2 = nDouble2;
	}

	@Override
	public void setPrecisao(boolean precisao) {
		this.precisao = precisao;
	}
	
	@Override
	public int calcularInt() {
		return this.nInt1 + this.nInt2;
	}
	
	@Override
	public double calcularDouble() {
		return this.nDouble1 + this.nDouble2; 
	}
	
	@Override
	public void mostrarResultado() {
		
		StringBuilder resultado = new StringBuilder()
				.append("O resultado do cálculo de SOMA foi: \n");
		
		if( this.precisao ) {
			resultado.append( String.valueOf( calcularDouble() ) );
		}else {
			resultado.append( String.valueOf( calcularInt() ) );
		}
		
		resultado.append(".");
		
		System.out.println( resultado.toString() );
		
	}
	
}
