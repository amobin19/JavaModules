class Person{
	// Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain	
	
	// 1. Data
	// 2. Subroutines (methods)
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Ayman Mobin";
		person1.age = 20;
		
		Person person2 = new Person();
		person2.name = "Dak Prescott";
		person2.age = 24;
		
		System.out.println("Name of person is " + person1.name);
		System.out.println("Age of person is " + person1.age);
		
		System.out.println("Name of other person is " + person2.name);
		System.out.println("Age of other person is " + person2.age);
		
	}
}
