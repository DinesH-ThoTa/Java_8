package streams_training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sreams_Assignment {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(30,40,20,33,25);
		Stream<Integer> stream=list.stream();
		Stream<Integer> stream1=list.stream();
		Stream<Integer> stream2=list.stream();
		int max=stream.max(Integer::compare).get();
		int min =stream1.min(Integer::compare).get();
		boolean check=stream2.anyMatch(n->(n==20));
		System.out.println(max+"  "+min+" "+check);
		
	}

}
