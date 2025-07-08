public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Sushrut", 500);
        System.out.println("New Score:" + newScore);

        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player:" + playerName + " Score:" + score);
        return score * 1000;
    }

    public static void calculateScore() {

        System.out.println("Match Abandoned");
    }

    public static void calculateScore(int score) {

        System.out.println("Score:" + score);
    }
}
