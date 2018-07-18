import java.util.Scanner;

public class InteractiveProgram {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		double value = scan.nextDouble();
		
		if(value < 10){
			System.out.println("This number is too small");
		}
		else{
			System.out.println("This number is big enough");
		}
	}
}
