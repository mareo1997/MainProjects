package Session10.AssignedQuizzes;

import java.util.ArrayList;

public class AssignedQuizzesImpl implements AssignedQuizzes {

    @Override
    public boolean findQuiz(String answer, ArrayList<String> userQuiz) {
        for (String s : userQuiz) {
            if (answer.equalsIgnoreCase(s)) {
                return true;
            }
        }

        return false;
    }

}
