package br.com.bino.testes;

import java.util.Arrays;
import java.util.StringTokenizer;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(nomeTeste = TestesConstants.BSTRING, testar = true)
public class BString extends TesteAbstract{

	public BString() {
		super.setNomeTeste(TestesConstants.BSTRING);
	}
	
	@Override
	public void teste() {
		
		exString();
		linha();
		
		juntarStringsManeiraErrada();
		linha();
		
		extrairCaracteres();
		linha();
		
		comparacoes();
		linha();
		
		buscas();
		linha();
		
		modificandoExtraindo();
		linha();
		
		juntaSepara();
		linha();
		
		concatenaStringBuilder();
		linha();
		
		concatenaStringBuffer();
		linha();
		
		exemploStringTokenize();
		linha();
		
		
	}

	/**
	 * Importante sobre Strings, é que podemos
	 * utilizar diversas maneiras de criar variaveis
	 * do tipo String. Podemos utilizar o new String()
	 * e nesse caso será sempre criada para essa new String()
	 * um espaço e endereço físico na memória.
	 * 
	 * Podemos também fazer atribição direta, e nesse caso
	 * sempre é utilizado o mesmo endereço de memória 
	 * independente de quantas variaveis utilizamos 
	 * com atribuição direta
	 */
	public void exString() {

		//cria String vazia
		String s1 = new String();
		System.out.println(1);
		
		//cria String passando uma String
		String s2 = new String("Fernando");
		System.out.println(s2);
		
		//cria String passando uma variável de referência
		String s3 = new String(s2);
		System.out.println(s3);
		
		//cria String passando array de char(letras)
		char[] letras = {'f','e','r','n','a','n','d','o'};
		String s4 = new String(letras);
		System.out.println(s4);
		
		String s5 = new String(letras, 0, 3);
		System.out.println(s5);
		
		//cria String passando array de byte(numeros das letras representadas)
		byte[] bLetras = {102,101,114,110,97,110,100,111};
		String s6 = new String(bLetras);
		System.out.println(s6);
		
		String s7 = new String(bLetras, 0, 3);
		System.out.println(s7);
		
		//atribuição por un boxing, atribuição direta
		String s8 = "Fernando";
		System.out.println(s8);
		
		
	}
	
	/**
	 * Abaixo, temos a maneira erra da juntar Strings
	 * pois a cad += está sendo criada uma nova String
	 * isso porque Strings no Java são imutáveis
	 * então pra concatenar dessa forma, por baixo
	 * dos panos sempre é criado um novo objeto e descartado
	 * o anterior, isso significa mais memória utilizada e menos
	 * performance
	 */
	public void juntarStringsManeiraErrada() {
		
		String nome = "Fernando";
		nome += " Bino";
		nome += " Machado";
		
	}
	
	public void extrairCaracteres() {
		
		String nome = "Fernando";
		
		//charAt()
		for(int i=0; i<nome.length(); i++) {
			System.out.print(nome.charAt(i));
		}
		
		System.out.println();
		
		//getBytes() - pegando "fer" ou pegando todos os bytes
		byte[] bytes = new byte[3];
		nome.getBytes(0,3,bytes,0);
		
		System.out.println(new String(bytes));
		System.out.println(Arrays.toString(bytes));
		
		char[] letrasNome = nome.toCharArray();
		System.out.println(Arrays.toString(letrasNome));
		
		
	}

	public void comparacoes() {
		
		String o1 = "Olá";
		String o2 = "OLá";
		String o3 = "Olá";
		
		//compara referência
		System.out.println( (o1 == o2) );
		System.out.println( (o1 == o3) );
		System.out.println( (o2 == o3) );
		
		//compara conteúdo
		System.out.println( o1.equals(o2) );
		System.out.println( o1.equals(o3) );
		System.out.println( o2.equals(o3) );
		
		System.out.println( o1.equalsIgnoreCase(o2) );
		System.out.println( o1.equalsIgnoreCase(o3) );
		System.out.println( o2.equalsIgnoreCase(o3) );
		
		
		//compara inicio e fim
		System.out.println("fernando".startsWith("fer"));
		System.out.println("fernando".endsWith("nando"));
		
		//compara se é maior menor ou igual (com base na tabela ascii)
		System.out.println("a".compareTo("b")); //a < b => -1
		System.out.println("a".compareTo("a")); //a == a => 0
		System.out.println("b".compareTo("a")); //a > b => 1
		
	}
	
	public void buscas() {
		
		String nome = "Fernando Bino machado";
		
		System.out.println(nome.indexOf("Bino"));
		System.out.println(nome.lastIndexOf("a"));
		System.out.println(nome.contains("bino"));
		System.out.println(nome.contains("Bino"));
		
	}
	
	public void modificandoExtraindo() {
		
		String nome = "Fernando";
		String sobreNome = "Bino Machado";
		String nomeCompleto = "";
		nomeCompleto = nomeCompleto.concat(nome);
		nomeCompleto = nomeCompleto.concat(" ");
		nomeCompleto = nomeCompleto.concat(sobreNome);
		
		System.out.println(nomeCompleto.substring(9,14));
		
		System.out.println(nomeCompleto.trim());
		System.out.println(nomeCompleto.replaceAll("Bino", "@@@@"));
		System.out.println(nomeCompleto.toLowerCase());
		System.out.println(nomeCompleto.toUpperCase());
	}
	
	public void juntaSepara() {
		
		System.out.println( String.join(" ", "a","b","c","d") );
		
		String[] arrPalavras = "o rato roeu a roupa do rei de roma".split(" "); 
		
		System.out.println(Arrays.toString(arrPalavras));
	}
	
	/**
	 * StringBuilder proporciona uma maneira correta e mais performatica
	 * de concatenar strings
	 */
	public void concatenaStringBuilder() {
		StringBuilder nome = new StringBuilder() ;
		nome.append("Fernando");
		nome.append(" Bino");
		nome.append(" Machado");
		
		System.out.println(nome.toString());
		System.out.println(nome.reverse());
	}
	
	/*
	 * StringBuffer é exatamente a mesma coisa que StringBuilder,
	 * única diferença é que é Thread safe, ou seja,
	 * pode ser utilizado em contextos de Thread
	 */
	public void concatenaStringBuffer() {
		StringBuffer nome = new StringBuffer() ;
		nome.append("Fernando");
		nome.append(" Bino");
		nome.append(" Machado");
		
		System.out.println(nome.toString());
		System.out.println(nome.reverse());
	}
	
	public void exemploStringTokenize() {
		
		String conteudo = "fernando;bino;machado\num;dois;tres";
		
		//iterando de uma única vez
		StringTokenizer st1 = new StringTokenizer(conteudo,";");
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		linha();
		
		//iterando por etapas
		StringTokenizer st2 = new StringTokenizer(conteudo,"\n");
		
		while(st2.hasMoreElements()) {
			
			StringTokenizer st3 = new StringTokenizer(st2.nextToken(), ";");
			
			while(st3.hasMoreElements()) {
				System.out.println(st3.nextToken());
			}
			
			System.out.println(".....................");
			
		}
		
		
		
	}
	
}
