package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.constants.TestesConstants;

public class FormatoPrintf extends TesteAbstract {

	public FormatoPrintf() {
		super.setNomeTeste(TestesConstants.FORMATO_PRINTF);
	}
	
	@Override
	public void teste() {
	
		if( testar ) {
			exemplos();
			saidasFormatadas();
			cupomFiscal();
		}
		
	}
	
	public void exemplos() {
		
		System.out.printf("%s", "fernando");
		linha();
		
		System.out.printf("%S", "fernando");
		linha();
		
		System.out.printf("%c",'f');
		linha();
		
		System.out.printf("%C",'f');
		linha();
		
		System.out.printf("%n");
		linha();
		
		System.out.printf("%d",1234567);
		linha();
		
		System.out.printf("%f",3.45);
		linha();
		
		
	}
	
	public void saidasFormatadas() {
		
		System.out.printf("teste%20s	%n","fernando");
		System.out.printf("teste%-20s	%n","fernando");
		System.out.printf("%015d		%n",1);
		System.out.printf("%,d			%n",10000000);
		System.out.printf("%.4f			%n",34.56);
		System.out.printf("R$%10.2f		%n",40554.9);
		
		linha();
		
	}
	
	public void cupomFiscal() {
		
		double[] precos = {1.89,4.56,5,6,31.2,14.5};
		
		double total = 0.0;
		
		String tracos =  "------------------------------------------------------";
		
		System.out.printf("Super Mercados Bino Cilada%n");
		System.out.printf("%s%n",tracos);
		
		
		for(int i=0;i<precos.length;i++) {
			total += precos[i];
			System.out.printf("Item %03d                                  R$%10.2f%n", i+1,precos[i]);
		}
		
		System.out.printf("%s%n",tracos);
		
		String fmt = "%"+String.valueOf( tracos.length() - 17 )+"s";
		
		System.out.printf( "Total" + fmt + "R$%10.2f%n", " ", total );
		
	}
	
	
	
	
	
	
	
}
