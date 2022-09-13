package functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> bicon = (a,b)->
		{
			System.out.println(a*b);
		};
		
		BiConsumer<Integer,Integer> bicon1 = (a,b)->
		{
			System.out.println(a/b);
		};
		
		
		bicon.andThen(bicon1).accept(12, 3);

	}

}
