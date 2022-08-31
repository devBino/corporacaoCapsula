package br.com.bino.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(nomeTeste = TestesConstants.TESTE_REGEX, testar = true)
public class TesteRegex extends TesteAbstract {

	@Override
	public void teste() {
		
		testeValidarEmail();
		linha();
		
		testeInicialRegex();
		
		linha();
		testeRegexNumeros();
		
		linha();
		testeRegexLetras();
		
		linha();
		String textoEntreColchetes = extraixTexto(
			"003ç10ç[1-10-100.97,2-30-2.53,3-40-3.11]çHomem de Ferro",
			"[\\[]{1}[\\S]{0,}[\\]]{1}"
		);
		
		System.out.println( textoEntreColchetes.replaceAll("[\\[\\]]", "") );
		
		/**
		 * além dos meta caracteres vistos nas funções acima temos:
		 * \\s espaços em branco (\t \n \f \r)
		 * \\S todos os caracteres excluindo os espaços em brancos
		 * \\w tudo que for de a-zA-Z, 0-9 e _
		 * \\W tudo que não for incluso no \\w
		 */
		
		/**
		 * com a expressão abaixo podemos limitar a busca em ranges
		 * [a-zA-Z]
		 * ou
		 * [abc]
		 */
		
	}
	
	/**
	 * No exemplo clássico abaixo
	 * usamos Pattern para compilar a expressão regular
	 * e depois, criamos um Matcher, que contem
	 * os indices onde a expressão regular foi encontrada
	 */
	public void testeInicialRegex() {
		
		String texto = "abaaba";
		
		Pattern pattern = Pattern.compile("aba");
		Matcher matcher = pattern.matcher(texto);
		
		while(matcher.find()) {
			System.out.println( matcher.start() );
			System.out.println( matcher.group() );
		}
		
	}
	
	/**
	 * Meta caractere para buscar apenas digitos
	 */
	public void testeRegexNumeros() {
		
		String texto = "asd88as6d86s7867d86a78";
		
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(texto);
		
		while( matcher.find() ) {
			System.out.println( matcher.group() );
		}
		
	}
	
	/**
	 * Meta caractere para buscar tudo que não for digito
	 */
	public void testeRegexLetras() {
		
		String texto = "a8s7das6d56a4sd55a4s5445ds4d";
		
		Pattern pattern = Pattern.compile("\\D");
		Matcher matcher = pattern.matcher(texto);
		
		while(matcher.find()) {
			System.out.println( matcher.group() );
		}
		
	}
	
	/**
	 * Recebe um texto e um regex, e extrai do texto o
	 * trecho equivalente a expressão encontrada
	 * onde:
	 * @param pTexto contem o texto completo
	 * @param pRegex contem a expressão usada para extrair trecho do texto
	 * @return String se encontrado texto ou null caso não tenh encontrado
	 */
	public String extraixTexto(String pTexto, String pRegex) {
		
		Pattern pattern = Pattern.compile(pRegex);
		Matcher matcher = pattern.matcher(pTexto);
		
		if(matcher.find()) {
			return matcher.group();
		}
		
		return null;
		
	}
	
	public static void testeValidarEmail() {
		
		String email = "programemachado@gmail.com";
		String regex = "[a-zA-Z0-9@.-_]+";
		
		System.out.println( email.matches(regex) );
		
	}
	
	public static void main(String[] args) {
		testeValidarEmail();
	}
	
	
}
