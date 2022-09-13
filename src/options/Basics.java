package options;

import java.util.Optional;

public class Basics {

	public static void main(String[] args) {
//		Optional<String> name=Optional.of(null);
//		we will get nullpointer exception if we acess name
		
		
		Optional<String> name=Optional.ofNullable("rahul");
		System.out.println(name.isPresent());
		System.out.println(name.isEmpty());
		
//		if the given string is null then else part will be considered
		String orElse=name
				.map(String::toUpperCase)
				//.orElse("no name");
				.orElseGet(()->
				{
					//we an write our code here
					return "no name";
				});
		System.out.println(orElse);
		
//		ifpresent method
		name.ifPresent(word->
		System.out.println("ifpresent function "+word)
		);
		
//		ifPresentOrElse
		name.ifPresentOrElse(word->
		System.out.println(word), 
		()->System.out.println("no name"));
	}
}
