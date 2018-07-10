class Person {
	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)
	void speak() {
		for (int i = 0; i < 1; i++) {
			System.out.println("My name is " + name + " am I am " + age + " years old.");
		}
	}
	
	void sayHello(){
		System.out.println("Hello there!");
	}
	
	int calculateYearstoRetirement(){
		int yearsLeft = 65 - age;
		// System.out.println(yearsLeft);
		
		return yearsLeft;
	}
	
	int getAge(){
		return age;
	}
	
	String getName(){
		return name;
	}
}

public class ReturnVal {
	public static void main(String[] args) {
		// Create person 1 object
		Person person1 = new Person();
		person1.name = "Ayman Mobin";
		person1.age = 20;
		person1.speak();
		person1.sayHello();
		person1.calculateYearstoRetirement();

		// Create person 2 object
		Person person2 = new Person();
		person2.name = "Dak Prescott";
		person2.age = 24;
		person2.speak();
		
		int years = person1.calculateYearstoRetirement();
		
		System.out.println("Years till retirement for " + person1.name + " is " + years);
		
		String name1 = person1.getName();
		int age1 = person1.getAge();
		String name2 = person2.getName();
		int age2 = person2.getAge();
		
		
		System.out.println(name1 + " is " + age1 + " years old.");
		System.out.println(name2 + " is " + age2 + " years old.");

		/*
		 * System.out.println("Name of person is " + person1.name);
		 * System.out.println("Age of person is " + person1.age);
		 * 
		 * System.out.println("Name of other person is " + person2.name);
		 * System.out.println("Age of other person is " + person2.age);
		 */
	}
}

