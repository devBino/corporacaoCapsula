package br.com.bino.repositories.interfaces.abstracts;

public abstract class Animal {

	/**
	 * Classes abstratas podem ter construtores
	 */
	public Animal() {
		System.out.println("Alguma classe extendeu a classe Animal...");
	}
	
	/**
	 * Em classes abstratas podemos criar os metodos que 
	 * as subClasses deverão ter, para isso 
	 * criamos apenas a assinatura do método como abaixo.
	 * Dessa forma torna-se obrigatória a implementação desse
	 * metodo nas subClasses
	 */
	public abstract void seMovimentar();
	
	/**
	 * Em classes abstratas, os metodos com implementação parcial
	 * que iniciam com public static e não tem a palavra abstract, não precisam
	 * ser implementados nas classes filhas que herdarem dessa classe
	 */
	public static void reproduzir() {
		System.out.println("Todo animal se reproduz...");
	}
}
