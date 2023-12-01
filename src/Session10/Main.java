package Session10;

import Session10.AccountValidation.AccountValidationImpl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
//        ArrayList<Integer> scores = new ArrayList<>();

        ArrayList<String> test = new ArrayList<>();
        test.add("Java");
        UserQuizes userQuiz = new UserQuizes(test);
        User u = new User(1, "mareo1997", "password", userQuiz);
        users.add(u);

        ArrayList<String> test2 = new ArrayList<>();
        test2.add("HTML");
        test2.add("CSS");
        UserQuizes userQuiz2 = new UserQuizes(test2);

        User u1 = new User(2, "user2", "password", userQuiz2);
        users.add(u1);

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
                u = accountValidationImpl.validateAccount(users, username, password);

                if (u == null) {
                    System.out.println("Could not find this username. Please check your number and password again.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("The information you entered is not correct please try again.");
                System.out.println();
//                in.nextLine();  // Consume newline left-over
            } catch (NullPointerException e) {
                System.out.println("Could not find this username. Please check your number and password again.");
                System.out.println();
//                in.nextLine();  // Consume newline left-over
            }
        }

        while (true) {
            System.out.println("Welcome to your your account " + u.getUsername() + ".");
            System.out.println("Type done to log out.");
//            UserQuizes uq = new UserQuizes();
            System.out.println(u.getUserQuiz());

            System.out.println("Enter the quiz you which to take.");
            String answer = in.nextLine();

            if("done".equalsIgnoreCase(answer)){
                System.out.println("You have logged out.");
                exit(0);
            }

            Quizzes q = new Quizzes();
            boolean b = q.findQuiz(answer, u.getUserQuiz().getTest());

            int points;
            if (b) {
                MCQClass mcqClass = new MCQClass();
                points = mcqClass.tests(answer);
//                UserQuizes a = u.getUserQuiz();
//                ArrayList<String> c = a.getTest();
//                c.remove(0);
//                a.setTest(c);
//                u.setUserQuiz(a);

                QuizResult quizResult = new QuizResult();
                quizResult.Pass(points);

            } else {
                System.out.println("This " + answer + " test is not applied to you. Please try again.");
            }


//            break;
        }

    }

}
