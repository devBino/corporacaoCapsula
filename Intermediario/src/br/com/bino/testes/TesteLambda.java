package br.com.bino.testes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;
import br.com.bino.ifaces.Calculo;
import br.com.bino.repositories.testes.CalculoLambda;

@TesteMap(nomeTeste = TestesConstants.TESTE_LAMBDA, testar = true)
public class TesteLambda extends TesteAbstract {

	@Override
	public void teste() {
		
		testSingleAbstractMethod();
		linha();
		
		testeStreamLimit();
		linha();
		
		testeStreamSkip();
		linha();
		
		testeStreamFilter();
		linha();
		
		testeStreamDistinct();
		linha();
		
		testeStreamReturnMap();
		linha();
		
		testeStreamReturnFilter();
		linha();
		
		testeStreamJoining();
		linha();
		
	}
	
	public void testSingleAbstractMethod() {
	
		CalculoLambda calculoLambda = new CalculoLambda(
			new Calculo() {
				
				@Override
				public int calcular() {
					return 1234;
				}
			}
		);
		
		System.out.println( calculoLambda.getResultado() );
		
		CalculoLambda calculoLambda2 = new CalculoLambda( ()->{return 123;} );
		
		System.out.println( calculoLambda2.getResultado() );
		
	}
	
	public void testeStreamLimit() {
		
		List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		listNumbers.stream()
			.limit(3)
			.forEach(e -> System.out.println(e));
		
	}
	
	public void testeStreamSkip() {
		
		List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		listNumbers.stream()
			.skip(3)
			.forEach(e -> System.out.println(e));
		
	}
	
	public void testeStreamFilter() {
	
		List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		listNumbers.stream()
			.filter(e -> e >= 3 && e <= 7)
			.forEach(e -> System.out.println(e));
		
	}
	
	public void testeStreamDistinct() {
	
		List<Integer> listNumbers = Arrays.asList(1,1,2,2,3,3,4,4,5,5);
		
		listNumbers.stream()
			.distinct()
			.forEach(e -> System.out.println(e));
		
	}
	
	public void testeStreamReturnMap() {
		
		List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> listNumbersMultipliedForTwo = listNumbers.stream()
					.map(e -> e * 2)
					.collect(Collectors.toList());
		
		System.out.println( listNumbersMultipliedForTwo );
		
	}
	
	public void testeStreamReturnFilter() {
		
		List<String> listNames = Arrays.asList(
			"Fernando Bino",
			"Adilson da Silva",
			"Carla da Silva",
			"Pedro Bino"
		);
		
		String lastName = "bino";
		
		List<String> listClientVips = listNames.stream()
				.filter(name -> name.toLowerCase().contains(lastName.toLowerCase()))
				.collect(Collectors.toList());
		
		System.out.println(listClientVips);
				
	}
	
	public void testeStreamJoining() {
		
		List<String> nameParts = Arrays.asList("João","da","Silva");
		
		String fullName = nameParts.stream()
				.map(partName -> partName)
				.collect(Collectors.joining(" "));
		
		System.out.println(fullName);
		
	}
	
	
}
