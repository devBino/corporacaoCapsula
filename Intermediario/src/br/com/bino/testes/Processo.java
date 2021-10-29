package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.processos.MyThread;
import br.com.bino.repositories.processos.ProcessaDocumento;
import br.com.bino.repositories.processos.ThreadCorrida;
import br.com.bino.repositories.processos.Calculo;
import br.com.bino.repositories.processos.LeituraNome;

@TesteMap(nomeTeste = TestesConstants.PROCESSO, testar = true)
public class Processo extends TesteAbstract {

	public Processo() {
		super.setNomeTeste(TestesConstants.PROCESSO);
	}
	
	@Override
	public void teste() {
		
		myThread();
		linha();
		
		myThreadRunnable();
		linha();
		
		lerNomes();
		linha();
		
		lerNome();
		linha();
		
		threadCustomizada();
		linha();
		
		prioridadesThreads();
		linha();
		
	}
	
	public void myThread() {
		
		MyThread t1 = new MyThread("#1",false,250);
		t1.start();
		
		MyThread t2 = new MyThread("#2", true,500);
		
	}
	
	public void myThreadRunnable() {
		
		ThreadCorrida palio = new ThreadCorrida("#palio", 250, false);
		
		Thread t1 = new Thread(palio);
		t1.start();
		
		ThreadCorrida celta = new ThreadCorrida("#celta", 450, true);
		
	}

	/**
	 * O método ler nomes irá criar 3 Threads, irá ler todos os caracters
	 * caractere por caracter em um determinado ciclo de tempo
	 * e fazendo uso do método join() da classe Thread ira esperar
	 * o término de cada Thread para só então exibir a mensagem final
	 * de leitura de todos os nomes
	 * 
	 * É um exemplo correto e elegante de sabermos quando o 
	 * processamento de uma ou mais Threads acabou, e então tomar uma
	 * decisão.
	 */
	public void lerNomes() {
		
		LeituraNome l1 = new LeituraNome("fernando bino machado", 250);
		LeituraNome l2 = new LeituraNome("julio cesar bino machado", 150);
		LeituraNome l3 = new LeituraNome("dorli aparecida bino", 200);
		
		Thread t1 = new Thread(l1);
		Thread t2 = new Thread(l2);
		Thread t3 = new Thread(l3);
		
		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Todos os nomes foram lidos...");
		
	}
	
	/**
	 * O metodo lerNome() traz uma outra forma de 
	 * saber quando o processamento de uma Thread terminou.
	 * Usando while e o metodo isAlive() da classe Thread
	 */
	public void lerNome() {
		
		LeituraNome l1 = new LeituraNome("Fernando bino machado", 200);
		Thread t1 = new Thread(l1);
		
		t1.start();
		
		try {
			while(t1.isAlive()) {
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Leitura do nome finalizado...");
		
	}
	
	/*
	 * Podemos também criar classes customizadas que implementam a interface Runnable
	 * e assim podemos sobrescrever dentro dela o metodo run como segue o mandamento.
	 * 
	 * Outra coisa que podemos fazer é personalizar a maneira como
	 * startamos uma Thread passando a classe criada
	 * além de poder personalizar o método join dentro da própria
	 * classe.
	 * 
	 * Assim podemos ter uma classe bastante dinâmica dependendo da nossa
	 * necessidade, implementando Runnable, e seu método run, além de na
	 * própria classe, criar um método que vai iniciar a Thread e outro que
	 * irá retornar uma instância de Thread(this)
	 */
	public void threadCustomizada() {
		
		ProcessaDocumento p1 = new ProcessaDocumento("Certidão de Nascimento");
		ProcessaDocumento p2 = new ProcessaDocumento("Cpf");
		ProcessaDocumento p3 = new ProcessaDocumento("Certificado de alistamento militar");
		
		p1.processar();
		p2.processar();
		p3.processar();
		
		try {
			
			p1.getProcesso().join();
			p2.getProcesso().join();
			p3.getProcesso().join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Todos os documentos foram processados...");
		
	}
	
	/**
	 * Sempre que instanciamos uma nova Thread passando qualquer classe
	 * que implementa interface Runnable, podemos para essa nova instancia de 
	 * Thread, utilizar o método setPriotity(), esse método pode receber
	 * valore de 1 a 10. E quanto maior o valor passado, maior a prioridade de 
	 * execução da Thread.
	 */
	public void prioridadesThreads() {
		
		int valores1[] = {10,20,45,66,54,23,44,3};
		int valores2[] = {5,10,25,36,44,55,74,6};
		
		//instancias da classe Calculo que implementa Runnable
		Calculo som = new Calculo(valores1, valores2, '+');
		Calculo sub = new Calculo(valores1, valores2, '-');
		Calculo mul = new Calculo(valores1, valores2, '*');
		
		//setando a prioridade na instancia de Thread dentro da classe Calculo
		mul.getProcesso().setPriority(10);
		som.getProcesso().setPriority(5);
		sub.getProcesso().setPriority(3);
		
		//iniciando processo de calculo
		sub.calcular();
		som.calcular();
		mul.calcular();
		
		try {
			som.getProcesso().join();
			sub.getProcesso().join();
			mul.getProcesso().join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Todos os calculos foram finalizados...");
		
	}
	
	
	
}
