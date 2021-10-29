package br.com.bino.repositories.processos;

public class ProcessaDocumento implements Runnable {

	private String nomeDocumento;
	private int tempoCiclo;
	private Thread t;
	
	public ProcessaDocumento(String pNomeDocumento) {
		nomeDocumento = pNomeDocumento;
		tempoCiclo = 200;
	}
	
	public String getNomeDocumento() {
		return nomeDocumento;
	}
	
	@Override
	public void run() {
		try {
			
			System.out.printf("%n%nInicio processamento documento %s%n%n[",nomeDocumento);
			
			for(int i=0; i<nomeDocumento.length(); i++) {
				System.out.print(nomeDocumento.charAt(i));
				Thread.sleep(tempoCiclo);
			}
			
			System.out.printf("]%n%nFim documento %s%n%n",nomeDocumento);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void processar() {
		t = new Thread(this);
		t.start();
	}
	
	public Thread getProcesso() {
		return t;
	}
	
}
