package br.com.bino.repositories.processos.semaforo;

public class ProcessoSemaforo implements Runnable {

	private String cor;
	private boolean mudouCor;
	private boolean parar;
	private Thread process;
	
	public ProcessoSemaforo() {
		
		cor = "Verde";
		mudouCor = false;
		parar = false;
		
		process = new Thread(this);
		process.start();
		
	}
	
	@Override
	public void run() {
	
		try {
			
			while(!parar) {
				
				if(cor.equals("Verde")) {
					Thread.sleep(3000);
				}else if(cor.equals("Laranja")) {
					Thread.sleep(400);
				}else {
					Thread.sleep(2600);
				}
				
				mudarCor();
				
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void mudarCor() {
		
		if(cor.equals("Verde")) {
			cor = "Laranja";
		}else if(cor.equals("Laranja")) {
			cor = "Vermelho";
		}else {
			cor = "Verde";
		}

		mudouCor = true;
		notify();
		
	}
	
	public synchronized void esperaMudarCor() {
		try {
			while(!mudouCor) {
				wait();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		mudouCor = false;
	}
	
	public String getCor() {
		return cor;
	}
	
	public synchronized void pararSemaforo() {
		parar = true;
	}
	
}
