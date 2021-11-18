package br.com.bino.repositories.processos;

public class ProcessoTicTac implements Runnable {

	private String nome;
	private Thread process; 
	private final int QTDE = 5;
	private TicTac t;
	
	public ProcessoTicTac(String pNome, TicTac pTicTac) {
		nome = pNome;
		t = pTicTac;
		process = new Thread(this,pNome);
		process.start();
	}
	
	@Override
	public void run() {
		
		if(nome.contains("Tique")) {
			for(int i=0; i<QTDE; i++) {
				t.tique(true);
			}
			
			t.tique(false);
		}else {
			for(int i=0; i<QTDE; i++) {
				t.taque(true);
			}
			
			t.taque(false);
		}
		
	}
	
	public Thread getProcesso() {
		return process;
	}
	
}
