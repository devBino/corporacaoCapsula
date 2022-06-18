package br.com.bino.testes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.sound.midi.SysexMessage;

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
		
		testeStreamReduce();
		linha();
		
		testeStreamReduceWithIdentityValue();
		linha();
		
		testeStreamCollectReturningAnotherCollections();
		linha();
		
		testeStreamCollectorsToCalculateMetrics();
		linha();
		
		testeStreamCollectorsGroupAndPartitions();
		linha();
		
		testeDifferentWaysToCreateLambdaFunctions();
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
		
		Set<Integer> setNumbers = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		String filteredNumbers = setNumbers.stream()
				.filter(n -> n % 3 == 0)
				.map(n -> n.toString())
				.collect(Collectors.joining(";"));
		
		System.out.println(filteredNumbers);
		
	}
	
	public void testeStreamReduce() {
		
		List<Integer> listNumbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		//calculate the sum of all numbers
		Optional<Integer> sumNumbers = listNumbers.stream()
					.reduce((n1,n2) -> n1 + n2);
		
		System.out.println(sumNumbers.get());
		
		/*
		 * concat using streams like below example is not a very good practice but, 
		 * is only to mention it's possible
		 */
		List<String> nameParts = List.of("João","da","Silva");
		
		Optional<String> completeName = nameParts.stream()
				.reduce((s1,s2) -> s1.concat(s2));
		
		System.out.println(completeName.get());
		
	}
	
	public void testeStreamReduceWithIdentityValue() {

		List<Integer> listNumbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		Integer sumNumbers = listNumbers.stream()
				.reduce(1, (n1,n2) -> n1 + n2);
		
		System.out.println(sumNumbers);
		
		List<String> nameParts = List.of("João da Silva");
		
		String completeName = nameParts.stream()
				.reduce(" ", (s1,s2) -> s1.concat(s2));
		
		System.out.println(completeName);
		
	}
	
	public void testeStreamCollectReturningAnotherCollections() {
		
		List<Integer> listNumbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		//returns a List
		List<Integer> list = listNumbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(list);
		
		//returns a Set
		Set<Integer> set = listNumbers.stream()
				.filter((Integer n) -> {
					
					if( n > 5 ) {
						return true;
					}
					
					return false;
					
				})
				.collect(Collectors.toSet());
		
		System.out.println(set);
		
	}
	
	public void testeStreamCollectorsToCalculateMetrics() {
		
		Set<Integer> setNumbers = Set.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		//calculating the average
		Double average = setNumbers.stream()
				.collect(Collectors.averagingDouble(n -> n.doubleValue()));
		
		System.out.println("Average => " + average);
		
		//calculating the sum
		Integer sum = setNumbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.summingInt(n -> n.intValue()));
		
		System.out.println("Sum => " + sum);
		
		//retrieve a IntSummaryStatistics object that has some util metrics
		IntSummaryStatistics stats = setNumbers.stream()
				.filter(n -> n % 3 == 0)
				.collect(Collectors.summarizingInt(n -> n.intValue()));
		
		System.out.println("Average => " + stats.getAverage());
		System.out.println("Count => " + stats.getCount());
		System.out.println("Min => " + stats.getMin());
		System.out.println("Max => " + stats.getMax());
		System.out.println("Sum => " + stats.getSum());
		
		//counting how many elements it was found considering some filter
		Long totalNumbersFiltered = setNumbers.stream()
				.filter(n -> {return n % 2 == 0;})
				.collect(Collectors.counting());
		
		System.out.println("Total Numbers Filtered => " + totalNumbersFiltered);
		
		//retrieve the minimum value considering a filtered numeric range
		Optional<Integer> minValue = setNumbers.stream()
				.filter(n -> {
					
					//optionaly we can to implement a complex logic inside the filter
					if( n % 2 == 0 ) {
						return true;
					}
					
					return false;
					
				})
				.collect(Collectors.minBy(Comparator.naturalOrder()));
		
		System.out.println("Minimum value => " + minValue.get());
		
		//retrieve the maximum value considering a filtered numeric range
		//Note that, the logic inside the filter can be simple too
		//no matter, there's different way to implement streams
		Optional<Integer> maxValue = setNumbers.stream()
				.filter((Integer n) -> {return n % 2 == 0;})
				.collect(Collectors.maxBy(Comparator.naturalOrder()));
				
		System.out.println("Maximum value => " + maxValue);
		
	}
	
	public void testeStreamCollectorsGroupAndPartitions() {
		
		Set<Integer> setNumbers = Set.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		//mapping groups using groupingBy
		Map<Integer, List<Integer>> mapGroups = setNumbers.stream()
				.collect(Collectors.groupingBy(n -> n % 5));
		
		System.out.println("Groups\n");
		System.out.println("\t" + mapGroups);
		
		//mapping only two boolean values true/false using partitioningBy
		Map<Boolean, List<Integer>> boolGroups = setNumbers.stream()
				.collect(Collectors.partitioningBy(n -> n > 7));
		
		System.out.println("Boolean Groups\n");
		System.out.println("\t" + boolGroups);
		
	}

	public void testeDifferentWaysToCreateLambdaFunctions() {

		//Parenthesis is mandatory in three situations:
		
		//1 -When has more than one arguments
		Set<Integer> setNumbers = Set.of(1,2,3,4,5,6,7,8);
		Optional<Integer> sumNumbers = setNumbers.stream()
				.reduce((n1,n2) -> n1 + n2);
		
		System.out.println(sumNumbers.get());
		
		//2 - When needs to declare the argument type
		List<Integer> listNumbers = List.of(1,2,3,4,5,6,7,8);
		
		List<Integer> filteredListNumbers = listNumbers.stream()
				.filter((Integer n) -> n % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(filteredListNumbers);
		
		//3 - When there's no arguments
		Runnable runnable = () -> System.out.println("Aloha inside runnable impementation!!");
		Thread thread = new Thread(runnable);
		thread.start();
		
		//keys is mandatory when has more than one line
		//also, when needs to return something
		setNumbers.stream()
			.filter(n -> {
				System.out.println("aloha " + n);
				return true;
			})
			.forEach(System.out::println);
		
	}
	
}
