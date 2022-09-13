package streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streamreduce {
	
	
	public static int reduceUsingIdentity(List<Integer> IntegerList)
	{
		return IntegerList.stream()
		.reduce(1,(a,b)-> a*b);
	}
	
	
	public static Optional<Integer> reduceWithoutUsingIdentity(List<Integer> IntegerList)
	{
		return IntegerList.stream()
		.reduce((a,b)-> a*b);
	}
	
	
	

	public static void main(String[] args) {
		 
		List<Integer> integers=Arrays.asList(1,3,4,6);
		
		System.out.println(reduceUsingIdentity(integers));
		
		Optional<Integer> res = reduceWithoutUsingIdentity(integers);
		
		if(res.isPresent())//returns true if integers has elements else returns false
		{
			System.out.println(res.get());//get returns the result
		}
		else
			System.out.println("Pass input");
		

	}

}
