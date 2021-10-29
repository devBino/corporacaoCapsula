package br.com.bino.repositories.processos;

public class Calculo implements Runnable {

	private int[] valores1;
	private int[] valores2;
	private double[] resultados;
	private char sinal;
	private int tempo;
	
	private Thread t;
	
	public Calculo(int[] pValores1, int[] pValores2, char pSinal) {
		valores1 = pValores1;
		valores2 = pValores2;
		resultados = new double[pValores1.length];
		t = new Thread(this);
		sinal = pSinal;
		tempo = 300;
	}
	
	@Override
	public void run() {
		try {
			for( int i=0; i<valores1.length; i++ ) {
				if( sinal == '+' ) {
					resultados[i] = valores1[i] + valores2[i];
				}else if( sinal == '-' ) {
					resultados[i] = valores1[i] - valores2[i];
				}else if( sinal == '*' ) {
					resultados[i] = valores1[i] * valores2[i];
				}else if( sinal == '/' ) {
					resultados[i] = (valores1[i] > 0 && valores2[i] > 0) ? valores1[i] / valores2[i] : 0;
				}
				
				System.out.printf("Resultado de R$ %4.2f %c %4.2f%n", (float) valores1[i], sinal, (float) valores2[i]);
				Thread.sleep(tempo);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void calcular() {
		t.start();
	}
	
	public Thread getProcesso() {
		return t;
	}
	
}
