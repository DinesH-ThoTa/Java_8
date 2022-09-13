package streamsAPI;

import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;

public class StreamsFlatMap {
	
	
	
	
	public static List<String> activitiesList()
	{
		List<String> activities= StudentDataBase.getAllStudents().stream()//Stream<Students>
		.map(Student::getActivities) //Stream<List<String>>
		.flatMap(List::stream) //Stream<String> flattens 
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		
		return activities;
	}
	
	
	public static List<Student> sortedStudentsByName()
	{
		List<Student> a= StudentDataBase.getAllStudents().stream()//Stream<Students>
		.sorted(Comparator.comparing(Student::getName)) //Another sorted which takes comparator and sorts 
		.collect(Collectors.toList());
		return a;
	}
	
	
	public static List<Student> sortedStudentsByNameinReverse()
	{
		List<Student> a= StudentDataBase.getAllStudents().stream()//Stream<Students>
		.sorted(Comparator.comparing(Student::getName).reversed()) //Another sorted which takes comparator and sorts 
		.collect(Collectors.toList());
		return a;
	}
	

	public static void main(String[] args) {
		
		System.out.println(activitiesList());
		
		System.out.println(sortedStudentsByName());
		
		System.out.println(sortedStudentsByNameinReverse());
		
		
		

}
	
}
