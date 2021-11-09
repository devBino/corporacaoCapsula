package br.com.bino.repositories.processos;

public class SomaProcesso implements Runnable{

	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();
	
	public SomaProcesso(String pNome, int[] pNums) {
		nome = pNome;
		nums = pNums;
		new Thread(this,nome).start();	
	}
	
	@Override
	public void run() {
		
		System.out.printf("%-15s%s%n", "Inicio de ",nome);
		
		int soma = calc.somar(nums);
		
		System.out.printf("%-15s%d%n","Resultado:",soma);
		System.out.printf("%-15s%s%n", "Fim de ",nome);
		
	}
	
}
