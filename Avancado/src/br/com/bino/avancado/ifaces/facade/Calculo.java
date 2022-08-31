package br.com.bino.avancado.ifaces.facade;

public interface Calculo {

	default void setPrecisao(boolean precisao) {}
	int calcularInt();
	double calcularDouble();
	void mostrarResultado();

}
