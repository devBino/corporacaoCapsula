package br.com.bino.repositories;

import br.com.bino.iface.Animal;

@Animal(nome = "Bob", tipo = "cachorro", variedade = "Pastor Alemão" )
public class CachorroRepository extends AnimalRepository {

	public String nome;
	public String tipo;
	public String variedade;
	
	public CachorroRepository() {
		
	}
	
	public void latir() {
		System.out.println("O cachorro está latindo");
	}
	
	@Override
	public void andar() {
		System.out.println("O cachorro está correndo com suas quatro patas!!");
	}
	
}
