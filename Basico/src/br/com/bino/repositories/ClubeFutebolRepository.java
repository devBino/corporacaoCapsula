package br.com.bino.repositories;

import java.text.MessageFormat;

public class ClubeFutebolRepository {

	public String nome;
	public int mundiais;
	
	public int libertadores;
	
	private String idolo;
	
	public ClubeFutebolRepository() {
		nome = "indefinido";
		mundiais = 0;
		libertadores = 0;
		idolo = "indefinido";
	}
	
	public ClubeFutebolRepository(String pNome) {
		
		this(pNome, 0, 0);
		
	}
	
	public ClubeFutebolRepository(String pNome, int pMundiais, int pLibertadores) {
		nome = pNome;
		mundiais = pMundiais;
		libertadores = pLibertadores;
	}
	
	public void setIdolo(String pIdolo) {
		idolo = pIdolo;
	}
	
	public String getIdolo() {
		return idolo;
	}
	
	@Override
	public String toString() {
	
		String strDadosClube = "Nome: \t\t\t{0}\nTitulos Mundiais: \t\t\t\t{1}\nTitulos Libertadores: \t\t\t\t{2}\nIdolo: \t\t\t\t{3}";
		
		MessageFormat msgDadosClube = new MessageFormat(strDadosClube);
		
		String strIdolo = idolo != null ? idolo : "indefinido";
		
		return msgDadosClube.format(new Object[] {
			nome,mundiais,libertadores,strIdolo	
		});
		
	}
	
}
