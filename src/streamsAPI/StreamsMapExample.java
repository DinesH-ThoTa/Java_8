package streamsAPI;

import java.util.List;
import java.util.stream.*;

import data.Student;
import data.StudentDataBase;

public class StreamsMapExample {
	
	
	public static List<Integer> retList()
	{
		List<Integer> studentsList=StudentDataBase.getAllStudents().stream()
				.map(Student::getGradeLevel)
				.collect(Collectors.toList());
		return studentsList;
				
	}
	
	public static List<String> retListString()
	{
		List<String> studentsList=StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.toList());
		return studentsList;
				
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(retList());
		System.out.println(retListString());
		
	}

}
