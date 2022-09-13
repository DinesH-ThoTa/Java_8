package streamsAPI;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfIterateGenerate {

	public static void main(String[] args) {
		
		Stream<String> stringStream= Stream.of("Adam","Burn","Cook");
		stringStream.forEach(System.out::println);
		
		
		Stream.iterate(1,x->x*2)
		.limit(6)
		.forEach(System.out::println);
		
		Supplier<Integer> randomIntegers = new Random() :: nextInt;
		
		Stream.generate(randomIntegers)
		.limit(5)
		.forEach(System.out::println);
		
		

	}

}
