public class MemberFunction {
        public static void main(String[] args) {


            CalculateScore(true,800,5,100);

            CalculateScore(true,1000,9,210);
        }

    public static void CalculateScore(boolean GameOver, int Score, int LevelCompleted, int Bonus) {
        int FinalScore = Score + (LevelCompleted * Bonus);
        if (GameOver == true) {
            System.out.println("Final Score is Equal to " + FinalScore);
        }

    }
}

