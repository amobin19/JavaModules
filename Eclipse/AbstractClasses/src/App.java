public class App {
	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		cam1.run();
		car1.run();
		cam1.doStuff();
		car1.doStuff();
		cam1.shutdown();
		car1.shutdown();
		
		// Machine mach1 = new Machine();
	}
}
