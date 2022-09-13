package streamsAPI;

import data.StudentDataBase;

public class StreamsMatchExample {
	
	public static boolean allMatch() //return true if all matches 
	{
		return StudentDataBase.getAllStudents().stream()
		.allMatch(student -> student.getGpa()>=3.5);
	}
	
	public static boolean anyMatch() //returns true if any one matches
	{
		return StudentDataBase.getAllStudents().stream()
		.anyMatch(student -> student.getGpa()>=3.9);
	}
	
	public static boolean noneMatch() //returns true if none matches
	{
		return StudentDataBase.getAllStudents().stream()
		.noneMatch(student -> student.getGpa()>=5);
	}

	public static void main(String[] args) {
		
		System.out.println(allMatch());
		
		System.out.println(anyMatch());
		
		System.out.println(noneMatch());
		
	}

}
