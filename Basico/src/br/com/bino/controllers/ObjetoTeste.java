package br.com.bino.controllers;

import java.util.ArrayList;
import br.com.bino.iface.IfaceTeste;

public class ObjetoTeste implements IfaceTeste {

	public ArrayList<ObjetoTeste> objetos;
	public String nomeTeste;
	public Boolean testar;
	
	public ObjetoTeste() {
		objetos = new ArrayList<ObjetoTeste>();
	}
	
	@Override
	public void setNomeTeste(String pNomeTeste) {
		nomeTeste = pNomeTeste;
	}
	
	@Override
	public String getNomeTeste() {
		return nomeTeste;
	}
	
	@Override
	public void setTestar(Boolean pTestar) {
		testar = pTestar;
	}
	
	@Override
	public void teste() {
		System.out.println("Teste implementado na classe Pai que implementa interface padrão...");
	}
	
	public String linhaDivisao(char pValor, char pRepetir) {
		
		StringBuilder lin = new StringBuilder();
		
		for(int i=0;i<pRepetir;i++) {
			lin.append( String.valueOf(pValor) );
		}
		
		return lin.toString();
	}
	
}
