package br.com.bino.repositories.interfaces.exemplos;

import br.com.bino.repositories.interfaces.abstracts.Reptil;
import br.com.bino.repositories.interfaces.ifaces.Lagarto;

public class DragaoComodo extends Reptil implements Lagarto {

	@Override
	public void seMovimentar() {
		System.out.println("Dragão de Comodo é um animal do tipo reptil, por isso está andando de maneira esquisita...");
	}
	
	@Override
	public void liberarVeneno() {
		System.out.println("Por ser um réptil, e poder possuir veneno, o Dragão de comodo quando morde, libera veneno e persegue a presa até que ela morra...");
	}
	
	@Override
	public void comerOvos() {
		System.out.println("A maioria dos Lagartos adora ovos, então o dragão de comodo está comendo ovos de avestrus...");
	}
	
}
