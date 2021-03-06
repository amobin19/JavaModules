class Thing {
	public final static int LUCKY_NUM = 7;

	public String name;
	public static String description;

	public static int count = 0;
	
	public int id;

	public Thing() {
		id = count;
		
		count++;
	}
	
	static int getCount(){
		return count;
	}

	public void showName() {
		System.out.println("Object id: " + id + ", " + description + ": " + name);
	}

	public static void showInfo() {
		System.out.println(description);
		// Won't work: System.out.println(name);
	}
}

public class App {
	public static void main(String[] args) {

		Thing.description = "I am a thing";

		System.out.println(Thing.description);

		Thing.showInfo(); // print from showInfo method

		System.out.println("Before creating objects, count is: " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		System.out.println("After creating objects, count is: " + Thing.count);
		
		System.out.println("Getter got " + Thing.getCount() + " counts for things!");

		thing1.name = "Joe";
		thing2.name = "Shmoe";

		thing1.showName();
		thing2.showName();

		System.out.println(thing1.name);
		System.out.println(thing2.name);

		System.out.println(Math.PI);

		// Won't work: Math.PI = 3;

		System.out.println(Thing.LUCKY_NUM);
	}
}

// non static are instance variables
// static are class variables for all objects in the class