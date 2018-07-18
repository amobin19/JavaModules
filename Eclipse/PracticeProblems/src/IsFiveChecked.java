import java.util.Scanner;

public class IsFiveChecked {
	public static void main(String[] args) {
		int five = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(five != 5){
			System.out.println("Enter a number: ");
			if(scanner.hasNextInt()){
				five = scanner.nextInt();
			}
			else{
				scanner.nextLine();
			}
		}
		System.out.println("Got it!");
	}
}