public class StringStuff {
	public static void main(String[] args) {
		
		// Inefficient
		String info = "";
		
		info += "My name is Ayman.";
		info += " ";
		info += "I am a student.";
		
		System.out.println(info);
		
		// More efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Dak.");
		sb.append(" ");
		sb.append("I am the starting QB for the Dallas Cowboys.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Zeke.").append(" ").append("I am a RB");
		
		System.out.println(s.toString());
		
		// Formatting //
		
		System.out.println("Here is some text.\tThat was a tab.\nThat was a new line");
		System.out.println("More text.");
		
		// Formatting integers
		System.out.printf("Total cost %d; quantity is %d", 5, 120);
		
		for(int i = 0; i < 20; i++){
			System.out.printf("%-2d: %s\n", i, "here is some text");
		}
		
		// Formatting floating point value
		System.out.printf("Total value: %.2f\n", Math.PI);
		System.out.printf("Total value: %10.1f\n", 343.23423);
	}
}
