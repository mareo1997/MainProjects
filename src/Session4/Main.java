package Session4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        boolean stop = false;

        while(!stop){
            System.out.println("Student information for end of term report card");
            System.out.println("Type zero to exit");
            Scanner in = new Scanner(System.in);

            try{

                System.out.println("Enter student name");
                String name = in.nextLine();
                if(name.equalsIgnoreCase("0")){
                    stop = true;
                }

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
                Thread.sleep(4000);
                System.out.println();

            } catch (InputMismatchException e){
                System.out.println("The information you entered is not correct please try again.");
                System.out.println();
            }
        }


    }
}