package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;
import br.com.bino.ifaces.Texto;
import br.com.bino.repositories.classaninhada.Externa;
import br.com.bino.repositories.classaninhada.Externa.Interna;
import br.com.bino.repositories.classaninhada.Anonima;

@TesteMap(nomeTeste = TestesConstants.CLASSE_ANINHADA, testar = true)
public class ClasseAninhada extends TesteAbstract{

	public ClasseAninhada() {
		super.nomeTeste = TestesConstants.CLASSE_ANINHADA;
	}
	
	@Override
	public void teste() {
	
		classeAninhadaInterna();
		classeLocal();
		classeAnonima();
		interfaceComoClasseAnonima();
		
	}
	
	/**
	 * No exemplo a classe externa tem dentro dela outra classe,
	 * a classe Interna.
	 * 
	 * a  classe Interna pode conter um método
	 * que acesse atributos da classe Externa
	 * 
	 * na hora de instanciar a classe interna, fazemos da
	 * varExterna.new Interna()
	 * 
	 * na hora de importar a classe Interna, fazemos
	 * no fim do import, import  ... package.Externa.Interna
	 * 
	 * se o método que queremos acessa dentro de Interna
	 * é static, não precisamos instanciar e.new Interna();
	 */
	public void classeAninhadaInterna() {
		
		Externa e = new Externa();
		Interna i = e.new Interna();
		
		i.imprimeTexto();
		
		linha();
	}
	
	/**
	 * Uma classe local é criada dentro de algum método,
	 * e ela é visivel apenas dentro do método em que ela existe
	 */
	public void classeLocal() {
		
		
		//criação da classe Calculo dentro desse atual método
		class Calculo{
		
			private int valor1;
			private int valor2;
			private char sinal;
			
			Calculo(int pValor1,int pValor2, char pSinal){
				valor1 = pValor1;
				valor2 = pValor2;
				sinal = pSinal;
			}
			
			public int calcular() {
				
				if( sinal == '+' ) {
					return valor1 + valor2;
				}else if( sinal == '-' ) {
					return valor1 - valor2;
				}else if( sinal == '/' ) {
					return ( valor1 > 0 && valor2 > 0 ) ? valor1 / valor2 : 0;
				}else if( sinal == '*' ) {
					return valor1 * valor2;
				}
				
				return 0;
				
			}
			
		}
		
		
		//utilização da classe recém criada
		Calculo c = new Calculo(10, 19, '*');
		int r = c.calcular();
		
		linha();
		
	}
	
	public void classeAnonima() {

		Anonima a = new Anonima();
		
		a.main(new String[] {});
		
		linha();
		
	}
	
	public void interfaceComoClasseAnonima() {
		
		Texto t = new Texto() {
			
			@Override
			public void imprimeTexto() {
				
				System.out.println("Implementando interface texto, de maneira anonima...");
				
			}
			
		};
		
		t.imprimeTexto();
		
	}
	
}
