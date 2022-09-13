package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerExample {
	static Consumer<Student> c2 =(student)->System.out.println(student);
	static Consumer<Student> c3 =(student)->System.out.println(student.getName());
	static Consumer<Student> c4 =(student)->System.out.println(student.getActivities());
	static List<Student> studentlist = StudentDataBase.getAllStudents();
	
	public static void printstudents()
	{
		
		studentlist.forEach(c2);
	}
	
	
	public static void studentActivities()
	{
		studentlist.forEach(c3.andThen(c4));
	}
	
	public static void conditioncheck()
	{
		studentlist.forEach((student->
		{
			if(student.getGradeLevel()>=3)
			{
				c3.andThen(c4).accept(student);
			}
		}
		));
	}

	public static void main(String[] args) {
		
		Consumer<String> c1=(s)->System.out.println(s.toUpperCase());
		
		c1.accept("Sam");
		
		printstudents();
		studentActivities();
		conditioncheck();
	}

}
