public class HighScoreTable {
    public static void DisplayHighScorePosition(String name, int position){
        String message = name + " managed to get into position " + position + " on the high score table";
        System.out.println(message);
    }

    public static int CalculateHighScorePosition(int score){
        if(score >= 1000) {
            return 1;
        }
        else if(score < 1000 && score >= 500){
            return 2;
        }
        else if(score < 500 && score >= 100){
            return 3;
        }
        else {
            return 4;
        }
    }

    public static void main(String args[]){
        int highScorePos = CalculateHighScorePosition(1500);
        DisplayHighScorePosition("Ayman", highScorePos);

        highScorePos = CalculateHighScorePosition(900);
        DisplayHighScorePosition("Harvey", highScorePos);

        highScorePos = CalculateHighScorePosition(400);
        DisplayHighScorePosition("Mike", highScorePos);

        highScorePos = CalculateHighScorePosition(50);
        DisplayHighScorePosition("Rachel", highScorePos);
    }
}
