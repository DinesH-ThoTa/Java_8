package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ESexample {

	public static void main(String args[]) {
		ExecutorService es=Executors.newFixedThreadPool(10);
		es.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hey");
			}
		});

		es.shutdown();
	}
}
