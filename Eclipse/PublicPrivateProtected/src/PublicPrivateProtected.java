import world.Plant;

public class PublicPrivateProtected {
	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		// Won't work --- type is private
		// System.out.println(plant.type);
		
		// size is protected; this class not in same package 
		// won't work
		// System.out.println(plant.size);
		
		// Won't work; this class and Plan in different packages, height as package-level visibility
		System.out.println(plant.height);
	}
}

// private is only within class
// protected is accessible to child classes or package