package Session10.QuizResult;

public class QuizResultImpl implements QuizResult {

    @Override
    public void pass(int points) {
        System.out.println("You scored " + points + " points.");
        if (points >= 80) {
            System.out.println("You meet the 80% threshold!\n");
        } else {
            System.out.println("You did not meet the 80% threshold.\n");
        }
    }

}
