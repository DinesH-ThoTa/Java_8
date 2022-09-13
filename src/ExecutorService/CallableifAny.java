package ExecutorService;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableifAny {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newSingleThreadExecutor();
		
		Set<Callable<String>> callables=new HashSet<Callable<String>>();
		callables.add(new Callable<String>() {
			public String call() throws Exception
			{
				return "Task1";
			}
		});
		
		callables.add(new Callable<String>() {
			public String call() throws Exception{
				return "Task2";
			}
		});
		
		callables.add(new Callable<String>() {
		public String call() throws Exception
		{
			return "Task3";
		}
		});
		
		String result=es.invokeAny(callables);
		
		System.out.println(result);
		es.shutdown();
		
	}

}
