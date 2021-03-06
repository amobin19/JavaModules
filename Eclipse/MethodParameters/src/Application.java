class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int height){
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
}

public class Application {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.speak("Hey I'm rob.");
		rob.jump(8);
		rob.move("West", 45);
		
		String greeting = "France v Englad/Croatia in the final";
		rob.speak(greeting);
		
		int value = 37;
		rob.jump(value);
	}
}

