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
		
	}
}