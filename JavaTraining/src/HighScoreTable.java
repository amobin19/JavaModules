public class HighScoreTable {
    public static void DisplayHighScorePosition(String name, int position){
        String message = name + " managed to get into position " + position + " on the high score table";
        System.out.println(message);
    }

    public static int CalculateHighScorePosition(int score){
        int position = 4;
        if(score >= 1000) {
            position = 1;
        }
        else if(score >= 500){
            position = 2;
        }
        else if(score >= 100){
            position = 3;
        }
        return position;
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
