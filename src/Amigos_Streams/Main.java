package Amigos_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Person> people=getPeople();
//		filter
//		all male persons
		
//		imperative approach(not preferred)
		List<Person> male=new ArrayList<Person>();
		for(Person person : people)
		{
			if(person.getGender()==Gender.MALE)
				male.add(person);
		}
		
//		male.forEach(System.out::println);
		
//		declarative approach(preferred)
		List<Person> female=people.stream()
				  .filter(f->f.getGender()==Gender.FEMALE)
				  .collect(Collectors.toList());
		
		
//		female.forEach(f->System.out.println(f));
		
		
//		sort
		
		List<Person> sorted_byage=people.stream()
			  .sorted(Comparator.comparing(p -> p.getAge()))
			  .collect(Collectors.toList());
//		sorted_byage.forEach(p->System.out.println(p));
	
		
//		allmatch
		
		boolean allMatch=people.stream()
			  .allMatch(p -> p.getAge() > 7);
//		System.out.println(allMatch);
		
//		anyMatch
		
		boolean anyMatch=people.stream()
							   .anyMatch(p -> p.getAge()>100);
//		System.out.println(anyMatch);
		
//		noneMatch
		boolean noneMatch=people.stream()
								.noneMatch(p -> p.getAge() == 14);
//		System.out.println(noneMatch);

//		max
//		Optional<Person> max_ageperson=people.stream()
//			  .max(Comparator.comparing(p -> p.getAge()));
//		System.out.println(max_ageperson.get());
		
		//optimized code, max and min will produce the optionals
		people.stream()
			  .max(Comparator.comparing(p -> p.getAge()));
//			  .ifPresent(p -> System.out.println(p));
		
		
//		min
		Optional<Person> min_ageperson=people.stream()
			  .min(Comparator.comparing(p -> p.getAge()));
//		System.out.println(min_ageperson.get());
			
		
//		group
		
		Map<Gender, List<Person>> groupby_gender=people.stream()
		      .collect(Collectors.groupingBy(p -> p.getGender()));
		
		groupby_gender.forEach((g,p) ->
		{
			System.out.println(g);
			p.forEach(p1 -> System.out.println(p1));
		});
		
		
		
//		chaining these, getting name of eldest female
		
		people.stream()
			  .filter(p -> p.getGender().equals(Gender.FEMALE))
			  .max(Comparator.comparing(f -> f.getAge()))
			  .map(mf -> mf.getName())
			  .ifPresent(mfp -> System.out.println(mfp));
		
	}
	private static List<Person> getPeople() {
	    return List.of(
	        new Person("Antonio", 20, Gender.MALE),
	        new Person("Alina Smith", 33, Gender.FEMALE),
	        new Person("Helen White", 57, Gender.FEMALE),
	        new Person("Alex Boz", 14, Gender.MALE),
	        new Person("Jamie Goa", 99, Gender.MALE),
	        new Person("Anna Cook", 7, Gender.FEMALE),
	        new Person("Zelda Brown", 120, Gender.FEMALE)
	    );
	  }
}
