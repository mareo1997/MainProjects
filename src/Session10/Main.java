package Session10;

import Session10.AccountValidation.AccountValidationImpl;
import Session10.AssignedQuizzes.AssignedQuizzesImpl;
import Session10.MCQ.MCQListImpl;
import Session10.QuizResult.QuizResultImpl;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        ArrayList<Integer> scoreList = new ArrayList<>();

        ArrayList<String> testList = new ArrayList<>();
        testList.add("Java");
        UserQuizzes userQuiz = new UserQuizzes(testList);

        User u = new User(1, "mareo1997", "password", userQuiz, scoreList);
        userList.add(u);

        ArrayList<String> test2 = new ArrayList<>();
        test2.add("HTML");
        test2.add("CSS");
        UserQuizzes userQuiz2 = new UserQuizzes(test2);

        User u1 = new User(2, "user2", "password", userQuiz2, scoreList);
        userList.add(u1);

        while (true) {
            try {
                System.out.println("Welcome to quiz app");
                System.out.println("Please enter your username");
                String username = in.nextLine();
                System.out.println("Please enter your password");
                String password = in.nextLine();
//                in.nextLine();  // Consume newline left-over
                System.out.println();

                AccountValidationImpl accountValidationImpl = new AccountValidationImpl();
                u = accountValidationImpl.validateAccount(userList, username, password);

                if (u == null) {
                    System.out.println("Could not find this username. Please check your number and password again.");
                } else {
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Could not find this username. Please check your number and password again.");
                System.out.println();
//                in.nextLine();  // Consume newline left-over
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while (true) {
            System.out.println("Welcome to your your account " + u.getUsername() + ". Type 'done' to log out.");
//            UserQuizzes uq = new UserQuizzes();
            System.out.println(u.getUserQuiz());

            System.out.println("Enter the quiz you wish to take.");
            String answer = in.nextLine();

            if ("done".equalsIgnoreCase(answer)) {
                System.out.println("You have logged out.");
                exit(0);
            }

            AssignedQuizzesImpl q = new AssignedQuizzesImpl();
            boolean b = q.findQuiz(answer, u.getUserQuiz().getTest());

            int points;
            if (b) {
                MCQListImpl mcqListImpl = new MCQListImpl();
                points = mcqListImpl.testList(answer);
                scoreList.add(points * 10);
                u.setScores(scoreList);
//                UserQuizzes a = u.getUserQuiz();
//                ArrayList<String> c = a.getTest();
//                c.remove(0);
//                a.setTest(c);
//                u.setUserQuiz(a);

                QuizResultImpl quizResultImpl = new QuizResultImpl();
                quizResultImpl.Pass(points);

            } else {
                System.out.println("This " + answer + " test is not applied to you. Please try again.\n");
            }

//            System.out.println(u);
//            break;
        }

    }

}
