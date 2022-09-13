package Interface;


interface In1
{
	default void newMethod()
	{
		System.out.println("Newly added method");
	}
	
	static void anothernewMethod()
	{
		System.out.println("Another new Method");
	}
	
	String existingMethod(String str);
	
}

public class DefaultInterface implements In1 {

	@Override
	public String existingMethod(String str)
	{
		return str;
	}


public static void main(String[] args) {
	DefaultInterface obj=new DefaultInterface();
	System.out.println(obj.existingMethod("Hey"));
	obj.newMethod();
	
}
}