import java.util.Scanner;

public class IsFive {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		double five = 0;

		while (five != 5) {
			System.out.println("Print a number: ");
			five = num.nextDouble();
		}
		System.out.println("Got it!");
	}
}