package br.com.bino.repositories.processos;

public class TicTac {

	private boolean tique;
	
	public synchronized void tique(boolean executando) {
	
		if(!executando) {
			tique = true;
			notify();
			return;
		}
		
		tique = true;
		
		System.out.print("Tique ");
		
		notify();
		
		try {
			
			Thread.sleep(500);
			
			while(tique) {
				wait();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void taque(boolean executando) {
		
		if(!executando) {
			tique = false;
			notify();
			return;
		}
		
		System.out.println("Taque ");
		
		tique = false;
		
		notify();
		
		try {
			
			Thread.sleep(500);
			
			while(!tique) {
				wait();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
