package br.com.bino.repositories.processos;

public class MyThread extends Thread {

	private String nomeProcesso;
	private int tempo;
	
	public MyThread(String pNomeProcesso, boolean pStart, int pTempo) {
		
		nomeProcesso = pNomeProcesso;
		tempo = pTempo;
		
		/**
		 * Para que a class MyThread inicie automaticamente
		 * em qualquer nova instancia, basta chamar o metodo 
		 * start() aqui no seu construtor
		 */
		if(pStart) {
			start();
		}
		
	}
	
	@Override
	public void run() {
		
		try {
		
			for(int i=1; i<6; i++) {
				System.out.printf("Thread %s executando em %d...%n", nomeProcesso, i);
				Thread.sleep(tempo);
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
