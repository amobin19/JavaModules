class Frog{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name; // this refers to variable declared
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setInfo(String name, int age){
		setName(name);
		setAge(age);
	}
}
public class Application {
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		
		// frog1.name = "Vignesh";
		// frog1.age = 12;
		
		frog1.setName("Vigenesh");
		frog1.setAge(12);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
		frog1.setInfo("Billy", 25);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}
}

// Encapsulating data by capturing them
