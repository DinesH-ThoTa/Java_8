package java_8_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExample {

	public static void main(String[] args) {
		
		List<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		for(int iter:num)
		{
			System.out.println(iter);
		}
		
		num.forEach((n)->System.out.println(n));
		
		
		List find= num.stream().filter(n->n==10).collect(Collectors.toList());
		System.out.println(find);
		
		}

}
