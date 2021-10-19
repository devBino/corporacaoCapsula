package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.heranca.Programador;
import br.com.bino.repositories.heranca.Junior;
import br.com.bino.repositories.heranca.Pleno;

public class CtCasting extends ObjetoTeste {

	public CtCasting() {
		nomeTeste = TestesConstants.CASTING;
	}
	
	@Override
	public void teste() {
	
		if(testar) {
			upCasting();
			downCasting();
			castingsComInstanceOf();
		}
		
	}
	
	public void upCasting() {
		
		Junior junior = new Junior("Java", "Invasão a Marte");
		junior.setNivel("Sonhador, Precisa estudar lógica de programação para abstrair coisas da vida real e trazer a vida real para o mundo da programação :)");
		
		verDadosProgramador(junior);
		
		Programador p1 = (Programador) junior;
		verDadosProgramador(p1);
		
		Programador p2 = junior;
		verDadosProgramador(p2);
		
	}
	
	public void downCasting() {

		//maneira de downCasting que não funciona
		try {
			
			Programador programador = new Programador("Python","I.A");
			programador.setNivel(null);
			
			Pleno pleno = (Pleno) programador;
			
			verDadosProgramador(pleno);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//down casting que funciona
		Object oldText = "teste para down casting";
		String newText = (String) oldText;
		
		System.out.println(newText);

	}
	
	public void castingsComInstanceOf() {
		
		/**
		 * Exemplos de upCasting com instanceof 
		 */
		
		
		Junior junior = new Junior("Java", "Invasão a Marte");
		junior.setNivel("Sonhador, Precisa estudar lógica de programação para abstrair coisas da vida real e trazer a vida real para o mundo da programação :)");
		
		//junior é uma instancia de Junior, porém Junior extende Programador
		if( junior instanceof Programador ) {
			verDadosProgramador(junior);
		}
		
		//quando fazemos upCasting, a nova variavel tem referencia a utilizada no upCasting 
		Programador p1 = (Programador) junior;
		
		if( p1 instanceof Programador ) {
			verDadosProgramador(p1);
		}
		
		//upCasting direto, quando sabemos que a classe utilizada pra originar a nova, é menor que a nova
		Programador p2 = junior;
		verDadosProgramador(p2);
		
		
		/**
		 * Exemplos de downCasting com instanceof 
		 */
		
		
		//Nesse caso fariamos um 
		Programador p3 = new Programador("Ruby","Automação");
		p3.setNivel("Sênior, faz automação com Ruby");
		
		if( p3 instanceof Junior ) {
			verDadosJunior( (Junior) p3 );
		}
		
		Junior j1 = new Junior("VBA","Mineração de Dados no Excel");
		j1.setNivel("Jedi!!!");
		
		if( j1 instanceof Junior ) {
			verDadosJunior(j1);
		}
		
	}
	
	public void verDadosProgramador(Programador pProgramador) {
		System.out.println( pProgramador.toString() );
		System.out.println( linhaDivisao( '_', (char) 60) );
	}
	
	public void verDadosJunior(Junior pJunior) {
		System.out.println( pJunior.toString() );
		System.out.println( linhaDivisao( '_', (char) 60) );
	}
	
}
