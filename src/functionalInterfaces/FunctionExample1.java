package functionalInterfaces;

public class FunctionExample1 {
	
	public static String concat(String s)
	{
		return FunctionInterface.fun1.apply(s);
	}

	public static void main(String[] args) {
		
		System.out.println(concat("Hello"));
	}

}
