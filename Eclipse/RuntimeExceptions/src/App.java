public class App {
	public static void main(String[] args) {
		String text = null;
		
		String[] texts = {"one", "two", "three"};
		
		try{
			System.out.println(texts[3]);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}