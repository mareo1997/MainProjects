package Session10;

import java.util.ArrayList;
import java.util.Scanner;

public class Quizzes implements QuizInterface {

    static Scanner in = new Scanner(System.in);

    @Override
    public boolean findQuiz(String answer, ArrayList<String> userQuiz) {
//        int points = 0;
        for (String s : userQuiz) {
            if (answer.equalsIgnoreCase(s)) {
//                points = MCQ(s);
                return true;
            }
        }

        return false;
    }

//    @Override
//    public int MCQ(String s) {
//        String answer;
//        int points = 0;
//
//        switch (s.toUpperCase()) {
//            case "JAVA":
//                Java java = new Java();
//                points = java.question();
//                break;
//            case "HTML":
//                HTML html = new HTML();
//                points = html.question();
//                break;
//            case "CSS":
//                CSS css = new CSS();
//                points = css.question();
//                break;
//
//        }
//
////        if (s.equalsIgnoreCase("Java")) {
////        } else if (s.equalsIgnoreCase("HTML")) {
////            System.out.println("Which tag contains html metadata?\nA. <head>\nB. <p>\nC. <body>\nD. <a>\n");
////            answer = in.nextLine();
////            if ("a".equalsIgnoreCase(answer)) {
////                points += 2;
////            }
////        } else if (s.equalsIgnoreCase("CSS")) {
////            System.out.println("The full form of CSS is:\nA. Coloured Special Sheets\nB. Cascading Style Sheets\nC. Color and Style Sheets\nD. None of the above\n");
////            answer = in.nextLine();
////            if ("b".equalsIgnoreCase(answer)) {
////                points += 2;
////            }
////        }
//        return points;
//    }
}
