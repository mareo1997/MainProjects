package Session6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);

        ArrayList<Student> studentArraylist = new ArrayList<>();
        Student student = new Student("Mareo", 5, "1A");
        studentArraylist.add(student);

        while (true) {
            System.out.println("Student information for end of term report card");
//            System.out.println("Type zero to exit");

            try {

                System.out.println("Enter student information below");
                System.out.println("Enter student name");
                String name = in.nextLine();

                System.out.println("Enter student id");
                int id = in.nextInt();
                in.nextLine();  // Consume newline left-over

                System.out.println("Enter class");
                String classNumber = in.nextLine();

                student = new Student(name, id, classNumber);
                studentArraylist.add(student);

                System.out.println("Is this the last student.\nType Yes to exit");
                String answer = in.nextLine();

                if (answer.equalsIgnoreCase("YES")) {
                    break;
                }
                Thread.sleep(4000);
                System.out.println();
//                in.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("The information you entered is not correct please try again.");
                System.out.println();
            }
        }

        System.out.println(studentArraylist);

        while (true) {
            try {
                System.out.println("Please enter the student id");
                int id = in.nextInt();
                in.nextLine();  // Consume newline left-over

                List<Student> result = studentArraylist.stream().filter(x -> x.getId() == id).toList();

                if (result.size() > 0) {
                    System.out.println("Enter the following grades for:\nMath\nScience\nEnglish\nComputer Science");
                    ArrayList<Integer> marks = new ArrayList<>();
                    marks.add(in.nextInt());
                    marks.add(in.nextInt());
                    marks.add(in.nextInt());
                    marks.add(in.nextInt());
                    in.nextLine();  // Consume newline left-over

                    ReportCard reportCard = new ReportCard(result.get(0), marks);

                    System.out.println(reportCard);
                    Thread.sleep(4000);
                } else {
                    System.out.println("Could not find this id please try again");
                    System.out.println();
                }

                System.out.println("Is this the last student.\nType Yes to exit");
                String answer = in.nextLine();

                if (answer.equalsIgnoreCase("YES")) {
                    break;
                }

            } catch (NullPointerException | InputMismatchException e) {
//                in.nextLine();  // Consume newline left-over
                System.out.println("The information you entered is not correct please try again.");
                System.out.println();
            }
        }
    }
}