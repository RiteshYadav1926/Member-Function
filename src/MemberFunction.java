public class MemberFunction {
        public static void main(String[] args) {

            boolean GameOver = true;
            int Score = 800;
            int LevelCompleted = 5;
            int Bonus = 100;

            int FinalScore = Score + (LevelCompleted * Bonus);
            if (GameOver) {
                System.out.println("Final Score is Equal to " + FinalScore);
            }

            Score = 1000;
            LevelCompleted = 9;
            Bonus = 210;

            FinalScore = Score +(LevelCompleted * Bonus);
            if(GameOver) {
                System.out.println("Final Score is Equal to " + FinalScore);
            }
        }

    public static void CalculateScore(boolean GameOver, int Score, int LevelCompleted, int Bonus){

        int FinalScore = Score + (LevelCompleted * Bonus);
        if (GameOver == true) {
            System.out.println("Final Score is Equal to " + FinalScore);
        }
}
