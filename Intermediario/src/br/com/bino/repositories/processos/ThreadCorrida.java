package br.com.bino.repositories.processos;

public class ThreadCorrida implements Runnable {

	private String carro;
	private int tempo;
	
	public ThreadCorrida(String pCarro, int pTempo, boolean pStart) {
	
		carro = pCarro;
		tempo = pTempo;
		
		if(pStart) {
			Thread t = new Thread(this);
			t.start();
		}
		
	}
	
	@Override
	public void run() {
		
		try {
			for(int i=1; i<=10; i++) {
				System.out.printf("Carro %s correndo na volta %d %n", carro, i);
				Thread.sleep(tempo);
			}
			
			System.out.printf("%n%n%s Terminou o circuito...%n%n", carro);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
