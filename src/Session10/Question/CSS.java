package Session10.Question;

import java.util.Scanner;

public class CSS implements Questions {

    static Scanner in = new Scanner(System.in);

    @Override
    public int questionsForTest() {
        int points = 0;
        System.out.println("""
                The full form of CSS is:
                A. Coloured Special Sheets
                B. Cascading Style Sheets
                C. Color and Style Sheets
                D. None of the above
                """);
        String answer = in.nextLine();
        if ("b".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                How can we change the background color of an element?
                A. background-color
                B. color
                C. Both A and B
                D. None of the above""");
        answer = in.nextLine();
        if ("a".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                How can we change the text color of an element?
                A. background-color
                B. color
                C. Both A and B
                D. None of the above""");
        answer = in.nextLine();
        if ("b".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                In how many ways can CSS be written in?
                A. 1
                B. 2
                C. 3
                D. 4
                """);
        answer = in.nextLine();
        if ("c".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                What type of CSS is the following code snippet? <h1 style="color:blue;">A Blue Heading</h1>\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040
                A. Inline
                B. Internal
                C. External
                D. None of the above""");
        answer = in.nextLine();
        if ("a".equalsIgnoreCase(answer)) {
            points += 2;
        }
        return points;
    }
}
