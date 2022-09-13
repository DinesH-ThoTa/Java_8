package Interface;

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
    	
    
    @FunctionalInterface  
    interface Sayable extends Doable{  
         void say(String msg);   // abstract method  
        }  

public class SAMM2 implements Sayable{
	public void say(String msg)
	{
		System.out.println(msg);
	}


	public static void main(String[] args) {
		
		SAMM2 obj=new SAMM2();
		obj.say("Hello");
	}

}
}


