public class LoopingArray2D {
	public static void main(String[] args){
		String[][] texts = {
			{"a", "b", "c"},
			{"d", "e", "f"}
		};
		for(int row = 0; row < 2; row++){
			for(int col = 0; col < 3; col++){
				System.out.print(texts[row][col]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}