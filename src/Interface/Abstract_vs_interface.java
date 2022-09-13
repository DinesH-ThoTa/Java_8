package Interface;


interface In{
	default void say()
	{
		saySomething();// Calling private method
		sayPolitely();// Calling private static method
	}
	
	// Private static method inside interface
	 private void saySomething() {  
	        System.out.println("Hello... I'm private method");  
	    } 
	
	// Private static method inside interface  
    private static void sayPolitely() {  
        System.out.println("I'm private static method");  
    }  
}

public class Abstract_vs_interface implements In {

	public static void main(String[] args) {
		
		Abstract_vs_interface obj =new Abstract_vs_interface();
		
		obj.say();
		
	}

}
