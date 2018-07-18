import java.util.*;

public class OneOrSixtySix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		String text = scan.nextLine();
		
		switch(text){
		case "1":
			System.out.println("Got 1");
			break;
		case "66":
			System.out.println("Got 66");
			break;
		default:
			System.out.println("Got something else");				
		}
	}
}
