package Session10.Question;

import java.util.Scanner;

public class HTML implements Questions {

    static Scanner in = new Scanner(System.in);

    @Override
    public int questionsForTest() {
        int points = 0;
        String answer;
        System.out.println("""
                Which tag contains html metadata?
                A. <head>
                B. <p>
                C. <body>
                D. <a>""");
        answer = in.nextLine();
        if ("a".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                What does the abbreviation HTML stand for?
                A. HyperText Markup Language
                B. HighText Markup Language.
                C. HyperText Markdown Language.
                D. None of the above.""");
        answer = in.nextLine();
        if ("a".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                How many sizes of headers are available in HTML by default?
                A. 5
                B. 1
                C. 3
                D. 6""");
        answer = in.nextLine();
        if ("d".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                What is the smallest header in HTML by default?
                A. h1
                B. h2
                C. h6
                D. h4""");
        answer = in.nextLine();
        if ("c".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                What are the types of lists available in HTML?
                A. Bulleted, Numbered Lists.
                B. Ordered, Unordered Lists.
                C. Named, Unnamed Lists.
                D. None of the above.""");
        answer = in.nextLine();
        if ("b".equalsIgnoreCase(answer)) {
            points += 2;
        }
        return points;

    }
}
