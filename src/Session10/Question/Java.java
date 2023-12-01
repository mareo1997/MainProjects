package Session10.Question;

import java.util.Scanner;

public class Java implements Questions {

    static Scanner in = new Scanner(System.in);

    @Override
    public int questionsForTest() {
        int points = 0;
        String answer;

        System.out.println("""
                Number of primitive data types in Java are?
                A. 6
                B. 7
                C. 8
                D. 9
                """);
        answer = in.nextLine();
        if ("c".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                Select the valid statement.
                A. char[] ch = new char(5)
                B. char[] ch = new char[5]
                C. char[] ch = new char()
                D. char[] ch = new char[]
                """);
        answer = in.nextLine();
        if ("b".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                When an array is passed to a method, what does the method receive?
                A. The reference of the array
                B. A copy of the array
                C. Length of the array
                D. Copy of first element
                """);
        answer = in.nextLine();
        if ("a".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                Select the valid statement to declare and initialize an array.
                A. int[] A = {}
                B. int[] A = {1, 2, 3}
                C. int[] A = (1, 2, 3)
                D. int[][] A = {1,2,3}
                """);
        answer = in.nextLine();
        if ("b".equalsIgnoreCase(answer)) {
            points += 2;
        }

        System.out.println("""
                Arrays in java are-
                A. Object references
                B. Objects
                C. Primitive data type
                D. None
                """);
        answer = in.nextLine();
        if ("b".equalsIgnoreCase(answer)) {
            points += 2;
        }

        return points;
    }
}
