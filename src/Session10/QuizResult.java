package Session10;

public class QuizResult implements QuizR {

    @Override
    public void Pass(int points) {
        System.out.println("You scored " + points + " points.");
        if (points >= 8) {
            System.out.println("You meet the 80% threshold!");
        } else {
            System.out.println("You did not meet the 80% threshold.");
        }
    }

}
