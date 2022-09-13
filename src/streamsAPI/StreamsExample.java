package streamsAPI;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsExample {

	static Predicate<Student> p1=s-> s.getGradeLevel()>=3;
	static Predicate<Student> p2=s-> s.getGpa()>=3.9;
	
	public static void main(String[] args) {
	
		Map<String,List<String>> studentmap = StudentDataBase.getAllStudents().stream()
				.peek(s->System.out.println(s))
				.filter(p1.and(p2))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentmap);
	}

}
