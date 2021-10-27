package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.testes.EscopoVariavelRepository;

@TesteMap(nomeTeste = TestesConstants.ESCOPO_VARIAVEL, testar = true)
public class EscopoVariavel extends TesteAbstract {

	public EscopoVariavel() {
		super.setNomeTeste(TestesConstants.ESCOPO_VARIAVEL);
	}
	
	@Override
	public void teste() {
	
		testeEscopo();
		escopoBloco();
		
	}
	
	public void testeEscopo() {
		
		EscopoVariavelRepository e = new EscopoVariavelRepository();
		
		e.setValor(10);
		
		System.out.println(e.getValor());
		System.out.println(e.calculaValorEscopoLocal(20));
		System.out.println(e.getValor());
		System.out.println(e.calculaValorEscopoClasse(20));
		System.out.println(e.getValor());
		
		linha();
		
	}
	
	public void escopoBloco() {
		
		boolean noite = true;
		
		if( noite ) {
			int hora = 20;
		}
		
		//System.out.println(hora);
		linha();
		
	}
	
	
}
