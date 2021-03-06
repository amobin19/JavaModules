class Machine{
	private String name;
	private int code;
	
	public Machine(){
		this("Jim", 26); // calling another consctructor
					 	 // has to be first line
		System.out.println("Constructor running!");
		
		name = "John Smith";
		
	}
	
	public Machine(String name){
		System.out.println("Second constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code){
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
}

public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
        // new Machine(); // other way to create a constructor
		
		Machine machine2 = new Machine("Joe");
		
		Machine machine3 = new Machine("Terry", 40);
	}
}
