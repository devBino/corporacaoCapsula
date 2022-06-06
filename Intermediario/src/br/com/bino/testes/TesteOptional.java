package br.com.bino.testes;

import java.util.Optional;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;
import br.com.bino.exceptions.MapTesteException;

@TesteMap(nomeTeste = TestesConstants.TESTE_OPTIONAL, testar = true)
public class TesteOptional extends TesteAbstract {

	@Override
	public void teste() {

		testeGet();
		linha();
		
		testeIsPresent();
		linha();
		
		testeIfPresent();
		linha();
		
		testeOrElse();
		linha();
		
		testeOrElseGet();
		linha();
		
		testeOrElseThrow();
		linha();
		
	}
	
	public Optional<Integer> converteNumero(String pNumero){
		
		try {
			
			Integer nReturn = Integer.valueOf(pNumero);
			return Optional.ofNullable(nReturn);
			
		}catch(Exception error) {
			
			return Optional.empty();
			
		}
		
	}
	
	public Integer getNumeroAlternativo() {
		return 123;
	}
	
	public void testeGet() {
		
		Optional<Integer> num = converteNumero("123");
		
		System.out.println( num.get() );
		
	}
	
	public void testeIsPresent() {
		
		Optional<Integer> num1 = converteNumero("123");
		Optional<Integer> num2 = converteNumero("aloha!!");
		
		System.out.println(num1.isPresent());
		System.out.println(num2.isPresent());
		
	}
	
	public void testeIfPresent() {
		
		Optional<Integer> num1 = converteNumero("123");
		Optional<Integer> num2 = converteNumero("aloha!!");
		
		num1.ifPresent(n -> System.out.println("Valor de n => " + n));
		num2.ifPresent(n -> System.out.println("Valor de n => " + n));
		
	}
	
	public void testeOrElse() {
		
		Optional<Integer> num1 = converteNumero("aloha!!");
		
		System.out.println( num1.orElse(123) );
		
	}
	
	public void testeOrElseGet() {
		
		Optional<Integer> num1 = converteNumero("aloha!!");
		
		System.out.println( num1.orElseGet( () -> { return getNumeroAlternativo(); } ) );
		
	}
	
	public void testeOrElseThrow() {
		
		Optional<Integer> num1 = converteNumero("aloha!!");
		
		System.out.println( num1.orElseThrow( () -> new MapTesteException("aloha!! deu erro!!") ) );
		
	}
	
	
}
