package br.com.bino.repositories.interfaces.exemplos;

import br.com.bino.repositories.interfaces.abstracts.Ave;
import br.com.bino.repositories.interfaces.ifaces.Passaro;

/**
 * 
 * PintaSilga Uma classe, objeto
 * que ao extender de Ave herda caracteristicas gerais 
 * abstratas de Aves, que por sua vez são Animais,
 * por isso também, Aves herdam caracteristicas genéricas de Animais
 * 
 * Com isso sabemos que PintaSilga é um Animal do tipo Ave, que deve ter comportamentos de Pássaro
 * por isso além de herdar coisas de Animal e Ave, implementa interface Passaro
 * para criarmos no PintaSilga os comportamentos de um Passaro
 * 
 * Animal 		=> seMovimentar(); 	=> classe abstrata Animal
 * Ave			=> cantar();		=> classe abstrata Ave
 * Passaro		=> comerAlpiste();	=> interface Passaro
 * PintaSilga 	=> é um passaro, que faz todas as coisas acima
 * 					através do uso das palavras extends e implements 
 *
 */
public class PintaSilga extends Ave implements Passaro {

	public String nome;
	
	public PintaSilga() {
		reproduzir();
	}
	
	@Override
	public void seMovimentar() {
		System.out.println("Pinta Silga é um animal do tipo ave, e por isso está voando...");
	}
	
	@Override
	public void cantar() {
		System.out.println("Por ser uma Ave, pinta silga está cantando...");
	}
	
	@Override
	public void comerAlpiste() {
		System.out.println("O pinta silga adora sementes de alpiste, como a maioria dos passaros...");
	}
	
	

}
