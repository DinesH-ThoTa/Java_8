package java_8_Lambda;

public class LambdaRunnable {

	public static void main(String[] args) {
		/*
		 * Prior java 8
		 */
		Runnable runnable =new Runnable() 
		{
			public void run()
			{
				System.out.println("Inside runnable");
			}
		};
		
		new Thread(runnable).start();
	
	
	/*
	 * Lambda
	 */
	
	Runnable runnableLambda = ()->System.out.println("Inside LambdaRunnable");
	
	
	new Thread(runnableLambda).start();
	
	new Thread(()->System.out.println("Inside Lambdarunnable1")).start();

	}
}
