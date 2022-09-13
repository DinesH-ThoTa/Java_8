package java_8_Lambda;

interface Addable{
	int add(int a , int b);
}
public class LambdaWithReturn {

	public static void main(String[] args) {
		
		// Lambda expression without return keyword.
		Addable a1=(x,y)->(x+y);
		System.out.println(a1.add(100, 200));
		
		 // Lambda expression with return keyword.  
		Addable a2=(x,y)->{
			return(x+y);
		};
		System.out.println(a2.add(200, 300));

	}

}
