package java_8_Lambda;


interface Drawable{
	void draw();
}
public class LammdaExample1 {

	public static void main(String[] args) {
		int width=10;
		//Using Legacy method
		/*
		Drawable d=new Drawable() {
			public void draw()
			{
				System.out.println("Width is " +width);
			}
		};
		d.draw();*/
		
		
		Drawable d=()->{ 
			System.out.println("Width is "+width);
		};
		d.draw();

	}

}
