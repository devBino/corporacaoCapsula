package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.constants.TestesConstants;

import br.com.bino.repositories.enumeradores.DiaSemana;
import br.com.bino.repositories.enumeradores.DiaFimSemana;
import br.com.bino.repositories.testes.Pessoa;

public class EnumTeste extends TesteAbstract{

	public EnumTeste() {
		super.setNomeTeste(TestesConstants.ENUMS);
	}
	
	@Override
	public void teste() {
	
		if( testar ) {
			enumDiaSemanas();
			enumDiaFimSemana();
			enumGeneroPessoa();
			exibirValoresEnum();
			recuperaValorDoEnum();
		}
		
	}
	
	/**
	 * Criação de um enum simplis
	 */
	public void enumDiaSemanas() {
		
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		
		System.out.println("Valor segunda = " + segunda);
		System.out.println("Valor terca = " + terca);
		
		linha();
		
	}
	
	/**
	 * Criação de um enum com construtor, semelhante a uma classe
	 */
	public void enumDiaFimSemana() {
		
		DiaFimSemana sabado = DiaFimSemana.SABADO;
		DiaFimSemana domingo = DiaFimSemana.DOMINGO;
		
		System.out.println("Valor sabado = " + sabado.getValor());
		System.out.println("Valor domingo = " + domingo.getValor());
		
		linha();
		
	}
	
	/**
	 * Criação de enum dentro de uma classe
	 */
	public void enumGeneroPessoa() {

		Pessoa p = new Pessoa("Fernando Bino Machado");
		
		p.setGenero('m');
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("\nGenero: " + p.getGenero());
		
		linha();
		
	}
	
	/**
	 * Utiliza laços de repetição para exibir os valores de um enum
	 */
	public void exibirValoresEnum() {
		
		DiaSemana[] diasSemana = DiaSemana.values();
		
		//usando for tradicional
		for(int i=0;i<diasSemana.length;i++) {
			System.out.println(diasSemana[i]);
		}
		
		linha();
		
		//usando for dinamico
		for(DiaSemana d : diasSemana) {
			System.out.println(d);
		}
		
		linha();
		
		DiaFimSemana[] diasFimSemana = DiaFimSemana.values() ;
		
		for(DiaFimSemana d : diasFimSemana) {
			System.out.println(d.getValor());
		}
		
		linha();
		
	}
	
	/**
	 * Utilizando Enum.valueOf() recupera o valor relacionado
	 * a string passada por parametro no valueOf, úitl pra quando não sabemos 
	 * o que tem no enum para aquela "chave", porém temos a "chave"
	 * para buscar
	 */
	public void recuperaValorDoEnum() {
		
		DiaFimSemana sabado = Enum.valueOf(DiaFimSemana.class, "SABADO");
		System.out.println("Valor recuperado = " + sabado.getValor());
		
		linha();
		
	}
	
	
}
