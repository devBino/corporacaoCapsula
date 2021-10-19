package br.com.bino.repositories.interfaces.ifaces;

/**
 * 
 * As intefaces definem como determinados grupos de objetos deverão se comportar
 * pode acontecer de nelas criarmos as constantes também
 *
 */
public interface Passaro {

	/**
	 * Interfaces não tem construtores
	 */
	
	/**
	 * Constantes comuns aos passaros
	 */
	public static final String COMIDA = "Alpiste";
	
	/**
	 * Definição de comportamentos dos Passaros
	 * nas interfaces, por padrão a definição de métodos
	 * é por si só public abstract, então todo método 
	 * definido nas interfaces, deve ser implementado nas classes
	 * que as implementam
	 */
	void comerAlpiste();
	
}
