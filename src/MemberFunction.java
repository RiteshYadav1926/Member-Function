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
        }
}
