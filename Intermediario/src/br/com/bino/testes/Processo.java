package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;
import br.com.bino.repositories.processos.MyThread;
import br.com.bino.repositories.processos.ThreadCorrida;

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
	
	
	
}
