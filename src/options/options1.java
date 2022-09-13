package options;

import java.util.Optional;

public class options1 {

	public static void main(String[] args) {
		
		
		Person p1=new Person("Rahul", "RAHUL@Gmail.Com");
		
//		this will throw an nullpointerException, so changing mail to optional
//		System.out.println(p1.getMail().toLowerCase());
		
		String email=p1.getMail()
				.map(s->s.toLowerCase())
				.orElse("Email not provided");
		System.out.println(email);
		
		
		
		if(p1.getMail().isPresent())
		{
			String mail=p1.getMail().get();
			System.out.println(mail.toLowerCase());
		}
		else
			System.out.println("Provide the mail");
	}

}
class Person{
	private String name;
	private String mail;
	
	
	public Person(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<String> getMail() {
		return Optional.ofNullable(mail);
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
