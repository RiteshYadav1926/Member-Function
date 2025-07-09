public class MemberFunction {
        public static void main(String[] args) {


            System.out.println("First Score is " + CalculateScore(true,800,5,100));

            System.out.print("Second Score is " + CalculateScore(true,1000,9,210));
        }

    public static int CalculateScore(boolean GameOver, int Score, int LevelCompleted, int Bonus) {
        int FinalScore = Score + (LevelCompleted * Bonus);
        if (GameOver == true) {
        }
        return FinalScore;
    }
}

