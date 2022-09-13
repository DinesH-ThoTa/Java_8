package methodReference;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerMethodreference {
	
	/*
	 * Using Lambda
	 */
	
	static Consumer<Student> c1=s -> System.out.println(s);
	
	/*
	 * Using method reference
	 */
	static Consumer<Student> c2=System.out::println;
	

	public static void main(String[] args) {
	
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(c2);
	}

}
