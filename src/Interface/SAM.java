package Interface;

//Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
//It is a new feature in Java, which helps to achieve functional programming approach.

interface FunIn{
	void say();
}

public class SAM implements FunIn{
	
	public void say() {
		System.out.println("Hey.....Implemented SAM");
	}

	public static void main(String[] args) {
		
		SAM obj=new SAM();
		obj.say();
		
		}
	

}
