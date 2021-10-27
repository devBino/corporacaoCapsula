package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

import br.com.bino.repositories.enumeradores.DiaSemana;
import br.com.bino.repositories.enumeradores.TipoDocumento;
import br.com.bino.repositories.enumeradores.Calculadora;
import br.com.bino.repositories.enumeradores.DiaFimSemana;
import br.com.bino.repositories.testes.Pessoa;

import java.util.Random;

@TesteMap(nomeTeste = TestesConstants.ENUMERADORES, testar = true)
public class EnumTeste extends TesteAbstract{

	public EnumTeste() {
		super.setNomeTeste(TestesConstants.ENUMERADORES);
	}
	
	@Override
	public void teste() {
	
		enumDiaSemanas();
		enumDiaFimSemana();
		enumGeneroPessoa();
		exibirValoresEnum();
		recuperaValorDoEnum();
		enumComMetodosAbstratos();
		calculadoraEnum();
		
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
	
	/**
	 * Enumeradores com metodos abstratos,
	 * onde cada valor deverá implementar o método abstrato
	 * especificado
	 */
	public void enumComMetodosAbstratos() {
		
		for(TipoDocumento doc : TipoDocumento.values()) {
			
			System.out.println(doc + " - " + doc.gerarNumero());
			
		}
		
		
		Pessoa p = new Pessoa("Fernando");
		p.setGenero('m');
		
		TipoDocumento t = TipoDocumento.CPF;
		p.setTipoDocumento(t);
		p.setNumeroDocumento(t.gerarNumero());
		
		linha();
		
	}
	
	/**
	 * Se utilizando de um enumerador,
	 * foi criada um calculadora, onde cada valor do enum
	 * é uma operação aritimetica, 
	 * e dentro do enum, temos o metodo abstrato calcular
	 * então cada valor do enum teve o metodo calcular implementado
	 * para cada operação aritimetica
	 */
	public void calculadoraEnum() {
		
		//Executando as operações da calculadora manualmente
		Calculadora som = Calculadora.SOMA;
		System.out.println( "Operação: " + som + " => " + som.calcular(11.23,34.98) );
		
		Calculadora sub = Calculadora.SUBTRACAO;
		System.out.println("Operação: " + sub + " => " + sub.calcular(567.89,345.98));
		
		Calculadora mul = Calculadora.MULTIPLICACAO;
		System.out.println("Operação: " + mul + " => " + mul.calcular(9,9));
		
		Calculadora div = Calculadora.DIVISAO;
		System.out.println("Operação: " + div + " => " + div.calcular(81,9));
		
		linha();
		
		//Executando as operações da calculadora dinamicamente
		for(Calculadora c : Calculadora.values()) {
		
			Random n = new Random();
			
			System.out.println( "Operação: " + c.toString() + " => " + c.calcular(n.nextDouble(),n.nextDouble())  );
			
		}
		
		linha();
	}
	
	
}
