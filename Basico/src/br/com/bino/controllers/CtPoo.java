package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

import br.com.bino.repositories.CarroRepository;
import br.com.bino.repositories.PessoaRepository;
import br.com.bino.repositories.ClubeFutebolRepository;
import br.com.bino.repositories.CalculadoraRepository;

public class CtPoo extends ObjetoTeste {

	public CtPoo() {
		nomeTeste = TestesConstants.POO;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			objetoBasico();
			objetoComMetodoVoid();
			objetoComMetodoReturn();
			objetoComMetodoParametro();
			objetoComConstrutores();
			objetoConstrutorComUsoPalavraThis();
			objetoComModificadoresAcesso();
			objetoComSobreCargaDeMetodos();
			objetoComStatic();
		}
		
	}
	
	public void objetoBasico() {
		
		CarroRepository fiat = new CarroRepository();
		
		fiat.marca = "Fiat";
		fiat.modelo = "Palio";
		fiat.numPassageiros = 5;
		fiat.capacidadeCombustivel = 42;
		fiat.consumoCombustivel = 15.5;
		
		System.out.println(fiat);
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void objetoComMetodoVoid() {
		PessoaRepository pessoa = new PessoaRepository();
		
		pessoa.nome = "Fernando";
		pessoa.genero = "M";
		pessoa.idade = 32;
		
		pessoa.exibirDados();
		System.out.println( linhaDivisao('_', (char) 60) );
	}
	
	public void objetoComMetodoReturn() {
		
		PessoaRepository pessoa = new PessoaRepository();
		
		pessoa.nome = "Beatriz";
		pessoa.genero = "F";
		pessoa.idade = 23;
		
		System.out.println( pessoa.retornarDados() );
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void objetoComMetodoParametro() {
		
		PessoaRepository pessoa = new PessoaRepository();
		
		pessoa.setNome("Beatriz");
		pessoa.genero = "F";
		pessoa.idade = 23;
		
		System.out.println( pessoa.retornarDados() );
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void objetoComConstrutores() {
		

		//objeto com construtor simples
		ClubeFutebolRepository spo = new ClubeFutebolRepository();
		
		spo.nome = "São Paulo Futebol Clube";
		spo.mundiais = 3;
		spo.libertadores = 3;
		
		System.out.println(spo.toString());
		
		//objeto com construtor recebendo parametros
		ClubeFutebolRepository cor = new ClubeFutebolRepository("Corinthians",2,1);
		
		System.out.println(cor.toString());
		
		System.out.println( linhaDivisao('_', (char) 60) );
	}
	
	public void objetoConstrutorComUsoPalavraThis() {
		
		//esse construtor da classe ClubeFutebolRepository usa palavra reservada this
		ClubeFutebolRepository pal = new ClubeFutebolRepository("Palmeiras");
		
		System.out.println( pal.toString() );
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void objetoComModificadoresAcesso() {
		
		ClubeFutebolRepository spo = new ClubeFutebolRepository("São Paulo Futebol Clube",3,3);
		
		/*
		 * todos os atributos da classe ClubeFutebolRepository são publicos
		 * porém, o atributo idolo é provado, só pode ser acessado dentro 
		 * da classe, então precisa usar o setIdolo para poder acessá-lo
		 */
		spo.setIdolo("Rogerio Ceni");
		
		System.out.println( spo.toString() );
		
		System.out.println( linhaDivisao('_', (char) 60) );
		
	}
	
	public void objetoComSobreCargaDeMetodos() {
		
		/*
		 * uma primeira maneira de somar dois valores utilizando a classe CalculadoraRepository
		 * 
		 */
		CalculadoraRepository calc1 = new CalculadoraRepository();
		
		calc1.setValor1(10);
		calc1.setValor2(25);
		
		System.out.println( "Primeiro Resultado: " + calc1.somar() );
		
		/*
		 * uma segunda maneira de somar dois valores utilizando a classe CalcularaRepository
		 * se aproveitando da sobre carga no construtor
		 */
		CalculadoraRepository calc2 = new CalculadoraRepository(39, 34);
		System.out.println( "Segundo Resultado: " + calc2.somar() );
		
		/*
		 * ume terceira maneira de somar dois valores utilizando a classe CalculadoraRepository
		 * se aproveitando da sobre carga no metodo somar
		 */
		CalculadoraRepository calc3 = new CalculadoraRepository();
		System.out.println("Terceiro Resultado: " + calc3.somar(65, 39));
		
		System.out.println( linhaDivisao('_', (char) 60 ) );
		
	}
	
	public void objetoComStatic() {
		
		System.out.println("Resultado com static em metodo: " + CalculadoraRepository.somar(1.87, 2.34));
		
		CalculadoraRepository.dbValor1 = 67.89;
		CalculadoraRepository.dbValor2 = 34.56;
		
		double soma = CalculadoraRepository.dbValor1 + CalculadoraRepository.dbValor2;
		System.out.println("Resultado com static em atributos: " + soma);
		
		System.out.println( linhaDivisao('_', (char) 60 ) );
		
	}
	
}
