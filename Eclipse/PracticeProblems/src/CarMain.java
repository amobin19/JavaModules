public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car("Bob");

		String carName = car1.getName();
		
		System.out.println("The car's name is " + car1.getName() + ".");
		car1.start();		
	}
}