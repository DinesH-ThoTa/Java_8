package ExecutorService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ESListExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es=Executors.newSingleThreadExecutor();
		@SuppressWarnings("rawtypes")
		Set<Callable<List>> callables= new HashSet<Callable<List>>();
		
		callables.add(() -> {
			List<Integer> list= new ArrayList<Integer>();
			list.add(10);
			list.add(15);
			return list;
		});
		
		callables.add(() -> {
			List<Integer> list= new ArrayList<Integer>();
			list.add(30);
			return list;
		});
			
		@SuppressWarnings("rawtypes")
		List<Future<List>> result=es.invokeAll(callables);
		for(@SuppressWarnings("rawtypes") Future<List> iter: result)
		{
			System.out.println(iter.get());
		}
		es.shutdown();
		
	}

}
