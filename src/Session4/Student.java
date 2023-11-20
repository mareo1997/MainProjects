package Session4;

import java.util.ArrayList;

public class Student {

    private String name;

    private int id;

    private String classNumber;

    private ArrayList<Integer> marks;

    public Student(String name, int id, String classNumber, ArrayList<Integer> marks) {
        this.name = name;
        this.id = id;
        this.classNumber = classNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        int total = totalMarks(getMarks());
        double avgGrade = averageGrade(total, getMarks().size());
        String grade = letterGrade(avgGrade);

        return "*************UA High School***********\n" +
                "Name\t\t" + getName() + "\n" +
                "Student ID\t" + getId() + "\n" +
                "Class\t\t" + getClassNumber() + "\n" +
                "Subject\t\tMarks\n" +
                "Math\t\t" + getMarks().get(0) + "%\n" +
                "Science\t\t" + getMarks().get(1) + "%\n" +
                "English\t\t" + getMarks().get(2) + "%\n" +
                "Computer\t" + getMarks().get(3) + "%\n" +
                "Science\n" +
        "**************************************\n" +
                "\t\t\tTotal = "+total + "\n" +
                "\t\t\tGPA = "+avgGrade + "\n" +
                "\t\t\tGrade = "+grade;
    }

    public int totalMarks(ArrayList<Integer> marks) {

        return marks.stream().mapToInt(v -> v).sum();
    }

    public double averageGrade(int totalMarks, int length) {

        return (double) totalMarks / (double) length;

    }

    public String letterGrade(double avgGrade) {

        if (avgGrade > 95) {
            return "A+";
        } else if (avgGrade >= 90 && avgGrade <= 94) {
            return "A";
        } else if (avgGrade >= 80 && avgGrade <= 89) {
            return "B";
        } else if (avgGrade >= 70 && avgGrade <= 79) {
            return "C";
        } else if (avgGrade >= 60 && avgGrade <= 69) {
            return "D";
        } else {
            return "F";
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

}
