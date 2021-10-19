package br.com.bino.controllers;

import br.com.bino.constants.TestesConstants;

/**
 * Para continuar com os exemplos dessa classe de testes verificar
 * @see https://tableless.com.br/java-tipos-de-dados/
 */
public class CtTipoPrimitivo extends ObjetoTeste {

	public CtTipoPrimitivo() {
		nomeTeste = TestesConstants.TIPOS_PRIMITIVOS;
	}
	
	@Override
	public void teste() {
		
		if(testar) {
			
			converteByte(200);
			converteShort(100000);
			converteInt(2147483648l);
			converteLong("9223372036854775808");
			converteFloat(9223372036854775807l);
			converteDouble(9223372036854775807l);
			
			printBoolean();
			converteChar('f');
			converteChar(102);
			converteChar(Character.MAX_VALUE);
			
			montarPalavraComChars(new char[] {'f','e','r','n','a','n','d','o'});
			
			long letraF = 'f';
			int letraE = 'e';
			double letraR = 'r';
			float letraN = 'n';
			
			montarPalavraComBytes(new byte[] {
					(byte) letraF,
					(byte) letraE,
					(byte) letraR,
					(byte) letraN,
					97,110,
					'd','o'
			});
			
			printIntELong();
			printDouble();
			printFloat();
			
			curiosidadeInt();
			curiosidadeChar();
			
		}
		
	}
	
	/**
	 * Recebe um long pValor e faz type cast para byte
	 * caso pValor esteja na faixa de -128 a 127,
	 * ou avisa que o valor recebido não pode
	 * ser convertido para byte
	 * 
	 * @param pValor
	 */
	public void converteByte(long pValor) {
		
		byte b = -128;
		
		if( pValor >= -128 && pValor <= 127 ) {
			b = (byte) pValor;
			System.out.println("O valor " + pValor + " foi convertido para byte...");
		}else {
			System.out.println("O valor " + pValor + " não pode ser convertido para byte");
		}
		
		
		
	}
	
	/**
	 * Recebe um long pValor e faz type cast para short
	 * caso pValor esteja na faixa de -32768 a 32767,
	 * ou avisa que o valor recebido não pode
	 * ser convertido para short
	 * 
	 * @param pValor
	 */
	public void converteShort(long pValor) {
		
		short s = -32768;
		
		if( pValor >= -32768 && pValor <= 32767 ) {
			s = (short) pValor;
			System.out.println("O valor " + pValor + " foi convertido para short...");
		}else {
			System.out.println("O valor " + pValor + " não pode ser convertido para short");
		}
		
	}
	
	/**
	 * Recebe um long pValor e faz type cast para int
	 * caso pValor esteja na faixa de -2147483648 a -2147483647,
	 * ou avisa que o valor recebido não pode
	 * ser convertido para int
	 * 
	 * @param pValor
	 */
	public void converteInt(long pValor) {
		
		int i = 0;
		
		if( pValor >= -2147483648 && pValor <= 2147483647 ) {
			i = (int) pValor;
			System.out.println("O valor " + pValor + " foi convertido para int...");
		}else {
			System.out.println("O valor " + pValor + " não pode ser convertido para int");
		}
		
	}
	
	/**
	 * Recebe um valor em string,
	 * verifica seu tamanho em caracteres
	 * se o tamanho for do mesmo tamanho de caracteres
	 * dos limites padrões do long,
	 * então tenta converter para long
	 * caso o limite mínimo de -9.223.372.036.854.775.808
	 * e máximo de 9.223.372.036.854.775.807
	 * não seja respeitado na durante a conversão,
	 * isto é, se ao tentar converter a String pValor
	 * e este valor numérico fique fora
	 * do intervalo mínimo e máximo,
	 * será exibida mensagem de erro
	 * 
	 * @param pValue
	 */
	public void converteLong(String pValor) {
		
		long l = 0;
		
		if( pValor.replace("-", "").length() <= 19 ) {
			
			try {
				
				l = (long) Long.parseLong(pValor);
				
				System.out.println("O valor " + pValor + " foi convertido para int...");
			}catch(Exception e) {
				System.out.println("Erro ao tentar converter " + pValor + " para long ");
			}
			
		}else {
			System.out.println("O valor " + pValor + " não pode ser convertido para long");
		}
		
	}
	
	
	/**
	 * Recebe um valor long e tenta elevar pValor ao quadrado
	 * o resultado desse calculo, tenta converter pra float
	 * caso os limites mínimo de 1.4E-45 e máximo de 3.4028235E38
	 * não forem respeitados, será gerado um valor Infinity na variavel do tipo
	 * float, impossobilitando o seu uso e correta visualização 
	 * 
	 * @param pValor
	 */
	public void converteFloat(long pValor) {
		
		float f = 0;
		
		f = (float) Math.pow((double) pValor, (double) pValor);
		System.out.println("O valor " + f + " foi convertido para float...");
		
		if( !Float.isInfinite(f) ) {
			System.out.println("O valor " + f + " foi convertido para float");
		}else {
			System.out.println("A conversão resultou em um valor infinito");
		}
		
	}
	
	/**
	 * Recebe um valor long e tenta elevar pValor ao quadrado
	 * o resultado desse calculo, tenta converter pra double
	 * caso os limites mínimo de 4.9E-324 e máximo de 1.7976931348623157E308
	 * não forem respeitados, será gerado um valor Infinity na variavel do tipo
	 * double, impossobilitando o seu uso e correta visualização 
	 * 
	 * @param pValor
	 */
	public void converteDouble(long pValor) {
		
		double d = 0;
		
		d = (double) Math.pow((double) pValor, (double) pValor);

		if( !Double.isInfinite(d) ) {
			System.out.println("O valor " + d + " foi convertido para double");	
		}else {
			System.out.println("A conversão resultou em um valor infinito");
		}
		
	}
	
	/**
	 * Recebe um inteiro pValor
	 * e caso ele esteja no intervalo entre 
	 * 0 e 65535, converte o inteiro recebido para char
	 * se não, exibe mensagem de erro
	 * 
	 * @param pValor
	 */
	public void converteChar(int pValor) {
		
		char c = 0;
		
		if( pValor >= (int) Character.MIN_VALUE && pValor <= (int) Character.MAX_VALUE ) {
			
			c = (char) pValor;
			System.out.println("O valor " + pValor + " foi convertido para char " + c);
		}else {
			System.out.println("Não foi possível converter " + pValor + " para char");
		}
		
	}
	
	/**
	 * Recebe um array de char[] e cria uma nova string
	 * com esse array
	 * 
	 * @param pValor
	 */
	public void montarPalavraComChars(char[] pValor) {
		
		String palavra = new String(pValor);
		System.out.println(palavra);
		
	}
	
	/**
	 * Recebe um array de byte[] e cria uma nova string
	 * com esse array
	 * 
	 * @param pValor
	 */
	public void montarPalavraComBytes(byte[] pValor) {
		
		String palavra = new String(pValor);
		System.out.println(palavra);
		
	}
	
	/**
	 * imprimindo um tipo literal double
	 * que é o padrão literal quando criamos números
	 * com ponto flutuante
	 */
	public void printDouble() {
		double num = 1.98;
		System.out.println( String.valueOf(num) );
	}
	
	/**
	 * A curiosidade é que n1 já está com valor máximo permitido ao tipo 
	 * literal int, e quando for imprimir a soma, ele irá iniciar 
	 * do menor valor possível somando o valor adicional
	 * de forma que os números no java funcionam como uma 
	 * espécie de roleta, ou seja,
	 * se ultrapassa o valor máximo, ele simplismente
	 * inicia novamente a contagem somando a partir 
	 * do menor valor para o respectivo tipo literal 
	 */
	public void curiosidadeInt() {
		
		int n1 = 2147483647;
		int n2 = 100;
		
		System.out.println(n1 + n2);
		
	}
	
	/**
	 * Por padrão quando criamos byte, short, int e long
	 * estamos criando inteiros.
	 * Ai o int é o tipo literal para o inteiro
	 * mas se queremos especificar que determinada variavel
	 * é do tipo long por exemplo
	 * basta colocar "l" de long no final
	 * do número, assim como fazemos no caso do float
	 */
	public void printIntELong() {
		
		int idade1 = 20;
		long idade2 = 20l;
		
		System.out.println("Idade 1: "+idade1+"\n\rIdade 2:"+idade2);
		
	}

	/**
	 * Por padrão quando criamos double e float estamos criando
	 * baseado no tipo literal double.
	 * Então para especificar que esse é float
	 * basta colocar f no final do número
	 */
	public void printFloat() {
		float num = 1.98f;
		System.out.println( String.valueOf(num) );
	}
	
	
	/**
	 * char contém o codigo ASCII então ao fazer
	 * char + char ele poderá somar
	 * e também, se fizermos
	 * "" + char + char ele ira concatenar como texto
	 */
	public void curiosidadeChar() {
		
		char o1 = 'o';
		char i1 = 'i';
		
		char o2 = 111;
		char i2 = 105;
		
		System.out.println( o1 + i1 );
		System.out.println( ""+o1+i1 );
		System.out.println( ""+o2+i2 );
		
	}
	
	public void printBoolean() {
		boolean v = true;
		boolean f = false;
		
		System.out.println("Valor de verdadeiro é: " + v);
		System.out.println("Valor de falso é: " + f);
	}
	
	
}
