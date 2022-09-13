package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateExample {
	
	static Predicate<Student> p1 = (s)->s.getGradeLevel()>3;
	
	static Predicate<Student> p2 = (s)->s.getGpa()>3;
	
	public static void main(String args[])
	{
		List<Student> studentlist=StudentDataBase.getAllStudents();
		
		
		
		studentlist.forEach(s -> {
			if(p1.and(p2).test(s))
			{
				System.out.println(s.getActivities()+ "and" +s.getName());
			}
		});
	}

}
