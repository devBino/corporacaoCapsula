package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(nomeTeste = TestesConstants.CLASSES_WRAPPERS, testar = true)
public class ClasseWrapper extends TesteAbstract {

	public ClasseWrapper() {
		super.setNomeTeste(TestesConstants.CLASSES_WRAPPERS);
	}
	
	@Override
	public void teste() {
	
		/**
		 * Os testes serão feitos de acordo com
		 * os 8 tipos primitivos do Java, pois cada tipo primitivo
		 * tem uma classe "Wrapper" criada no Java
		 * para facilitar o manuseio de dados 
		 * para o tipo primitivo
		 */
		
		wByte();
		wShort();
		wInteger();
		wLong();
		wDouble();
		wFloat();
		wChar();
		wBoolean();
		particularidadesClassesWrappers();
		boxing();
		
	}
	
	public void wByte() {
		
		byte b = 1;
		Byte wb = new Byte(b);
		Byte wb2 = b;
		
		System.out.println("Valores Byte: " + wb + " - " + wb2);
		
		linha();
		
	}
	
	public void wShort() {
		short s = 10;
		Short ws = new Short(s);
		Short ws2 = s;
		
		System.out.println("Valores Short: " + ws + " - " + ws2);
		
		linha();
	}
	
	public void wInteger() {
		
		int i = 100;
		Integer wi = new Integer(i);
		Integer wi2 = i;
		
		System.out.println("Valores Integer: " + wi + " - " + wi2);
		
		linha();
	}
	
	public void wLong() {
		
		long l = 1000;
		Long wl = new Long(l);
		Long wl2 = l;
		
		System.out.println("Valores Long: " + wl + " - " + wl2);
		
		linha();
	}
	
	public void wDouble() {
		
		double d = 1.99;
		Double wd = new Double(d);
		Double wd2 = d;
		
		System.out.println("Valores Double: " + wd + " - " + wd2);
		
		linha();
		
	}
	
	public void wFloat() {
		
		float f = 1.99f;
		Float wf = new Float(f);
		Float wf2 = f;
		
		System.out.println("Valores Float: " + wf + " - " + wf2);
		
		linha();
		
	}
	
	public void wChar() {
		
		char c = 'F'; //poderia ser o número 70 da tabela ascii 
		Character wc = new Character(c);
		Character wc2 = c;
		
		System.out.println("Valores Character: " + wc + " - " + wc2);
		
		linha();
		
	}
	
	public void wBoolean() {
		
		boolean b = true;
		Boolean wb = new Boolean(b);
		Boolean wb2 = b;
		
		System.out.println("Valores Boolean: " + wb + " - " + wb2);
		
		linha();
		
	}
	
	public void particularidadesClassesWrappers() {
		
		/*
		 * até o Java 9, podemos passar valores diferentes dos tipos 
		 * primitivos da classe para o construtor dela. Isto é,
		 * podemos passar String para o construtor de Integer
		 * mas cuidado com as exceções
		 */
		try {
			
			Integer n1 = new Integer("1");
			Integer n2 = new Integer("a");
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		/**
		 * Podemos utilizar funções parse das classes wrappers
		 * por exemplo, para converte de String para Integer
		 */
		Integer n3 = Integer.parseInt("10");
		
		/**
		 * Podemos utilizar o valueOf para fazer a mesma conversão
		 */
		Integer n4 = Integer.valueOf("10");
		
		/**
		 * Podemos ainda, converter o próprio tipo primitivo
		 * representado pela classe, para outro tipo de outra
		 * classe wrapper, mas temos que tomar cuidado com 
		 * a questão do tamanho em de cada tipo
		 */
		Byte b1 = n4.byteValue();
		
		linha();
		
	}
	
	/**
	 * Abaixo, conceito de autoboxing e auto un-boxing
	 */
	public void boxing() {
		
		/*
		 * AutoBoxing, quando jogamos direto o valor
		 * do tipo primitivo em uma instancia da classe Wrapper
		 * sem necessidade de instanciar com a palavra new 
		 */
		Byte b1 = 1;
		Short s1 = 10;
		Integer i1 = 100;
		Long l1 = 1000l;
		Double d1 = 1.99;
		Float f1 = 1.99f;
		Character c1 = 'F';
		Character c2 = 70;
		Boolean v1 = true;
		
		/**
		 * Auto Un-Boxing, quando jogamos criamos uma variável
		 * de tipo primitivo, e nessa variavel primitiva, 
		 * jogamos uma instancia de uma classe Wrapper 
		 * correspondente ao seu tipo
		 */
		byte b2 = b1;
		short s2 = s1;
		int i2 = i1;
		long l2 = l1;
		double d2 = d1;
		float f2 = f1;
		char c3 = c1;
		char c4 = c2;
		boolean v2 = v1;
		
		/**
		 * Podemos fazer autoboxing em variaveis
		 * das classes Wrappers, utilizando essas variaveis de classes
		 * Wrappers em expressões.
		 */
		System.out.println("Valor de i1 antes = " + i1);
		i1++;
		System.out.println("Valor de i1 depois = " + i1); 
		
		linha();
		
	}
	
}