import java.util.*;

public class FindGreaterThanTen {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Please enter a number: ");
			num = scan.nextInt();
		} while (num <= 10);

		System.out.println("Integer greater than 10 detected!");

	}
}
