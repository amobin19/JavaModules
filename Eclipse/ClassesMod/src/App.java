class Person {
	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)
	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + name + " am I am " + age + " years old.");
		}
	}
	
	void sayHello(){
		System.out.println("Hello there!");
	}
}

public class App {
	public static void main(String[] args) {
		// Create person 1 object
		Person person1 = new Person();
		person1.name = "Ayman Mobin";
		person1.age = 20;
		person1.speak();
		person1.sayHello();

		// Create person 2 object
		Person person2 = new Person();
		person2.name = "Dak Prescott";
		person2.age = 24;
		person2.speak();

		/*
		 * System.out.println("Name of person is " + person1.name);
		 * System.out.println("Age of person is " + person1.age);
		 * 
		 * System.out.println("Name of other person is " + person2.name);
		 * System.out.println("Age of other person is " + person2.age);
		 */

	}
}
