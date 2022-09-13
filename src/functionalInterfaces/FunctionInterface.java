package functionalInterfaces;

import java.util.function.Function;

public class FunctionInterface {
	
	static Function<String , String> fun =(s)->s.toUpperCase();
	
	static Function<String , String> fun1 =(s)->s.concat("World");

	public static void main(String[] args) {
		
		
		
		System.out.println(fun.andThen(fun1).apply("Hello"));
		
		System.out.println(fun.compose(fun1).apply("Hello"));
	}

}
