public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The Highscore is " + highScore);
        System.out.println("The Highscore is " + calculateScore(true, 10000, 8, 200));

        displayHighScorePosition("Ganesh", calculateHighScorePosition(600));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position: " + playerPosition);
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;
        if(score >= 1000)
            position = 1;
        else if(score >= 500)
            position = 2;
        else if(score >= 100)
            position = 3;
        return position;
    }
}
