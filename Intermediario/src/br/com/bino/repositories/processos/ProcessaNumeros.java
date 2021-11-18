package br.com.bino.repositories.processos;

public class ProcessaNumeros implements Runnable {

	private String nome;
	private boolean suspensa;
	private boolean terminada;
	
	public ProcessaNumeros(String pNome) {
		nome = pNome;
		suspensa = false;
		new Thread(this, pNome).start();
	}

	@Override
	public void run() {
		System.out.println("Iniciando " + nome);

		try {
			for(int i=0; i<10; i++) {
				System.out.println(i);
				Thread.sleep(250);
				
				synchronized (this) {
					
					while(this.suspensa) {
						wait();
					}
					
					if(this.terminada) {
						break;
					}
					
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Finalizando " + nome);
	}
	
	public void suspend() {
		this.suspensa = true;
	}
	
	public synchronized void resume() {
		this.suspensa = false;
		notify();
	}
	
	public synchronized void stop() {
		this.terminada = true;
		notify();
	}

}
