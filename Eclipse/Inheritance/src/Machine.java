public class Machine {
	//private String name = "Machine Type 1"; // same class only
	protected String name = "Machine Type 1"; // same package only
	
	public void start(){
		System.out.println("Machine started");
	}
	
	public void stop(){
		System.out.println("Machine stopped");
	}
}
