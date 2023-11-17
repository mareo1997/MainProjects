package Session4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        while(true){
            System.out.println("Student information for end of term report card");
            Scanner in = new Scanner(System.in);

            try{

                System.out.println("Enter student name");
                String name = in.nextLine();

                System.out.println("Enter student id");
                int id = in.nextInt();

                System.out.println("Enter class");
                String classNumber = in.next();

                System.out.println("Enter the following grades for:\nMath\nScience\nEnglish\nComputer Science");
                ArrayList<Integer> marks = new ArrayList<>();
                marks.add(in.nextInt());
                marks.add(in.nextInt());
                marks.add(in.nextInt());
                marks.add(in.nextInt());

                Student student = new Student(name, id, classNumber, marks);
                System.out.println(student);

            } catch (InputMismatchException e){
                System.out.println("The information you entered is not correct please try again.");
            }
        }


    }
}