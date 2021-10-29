package br.com.bino.repositories.processos;

public class LeituraNome implements Runnable {

	private String nome;
	private int tempoCiclo;
	
	public LeituraNome(String pNome, int pTempoCiclo) {
		nome = pNome;
		tempoCiclo = pTempoCiclo;
	}
	
	@Override
	public void run() {
	
		try {
			System.out.printf("%n%nLendo o nome => %s %n%n[", nome);
			
			for(int i=0; i<nome.length(); i++) {
				System.out.print(nome.charAt(i));
				Thread.sleep(tempoCiclo);
			}
			
			System.out.printf("]%n%nFinalizando leitura do nome %s %n%n", nome);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
