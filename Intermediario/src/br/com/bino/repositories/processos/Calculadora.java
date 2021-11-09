package br.com.bino.repositories.processos;

public class Calculadora {

	private int[] nums;
	private int soma;
	
	public Calculadora() {}
	
	public Calculadora(int[] pNums) {
		nums = pNums;
	}
	
	public synchronized int somar(int[] pNums) {
		
		soma = 0;
		
		try {
			for(int i=0; i<pNums.length; i++) {
				
				soma += pNums[i];
				
				System.out.println("Thread atual => " + Thread.currentThread().getName());
				System.out.println("Somando " + pNums[i] + " Resultado = " + soma);
				System.out.println("-------------------------------------------------");
				Thread.sleep(100);
				
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return soma;
		
	}
	
}
