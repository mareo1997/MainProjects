package Session6;

import java.util.ArrayList;

public class ReportCard implements Grading{

    private Student student;

    private ArrayList<Integer> marks;

    public ReportCard(Student student, ArrayList<Integer> marks) {
        this.student = student;
        this.marks = marks;
    }


    @Override
    public String toString() {
        int total = totalMarks(getMarks());
        double avgGrade = averageGrade(total, getMarks().size());
        String grade = letterGrade(avgGrade);

        return "*************UA High School***********\n" +
                "Name\t\t" + student.getName() + "\n" +
                "Student ID\t" + student.getId() + "\n" +
                "Class\t\t" + student.getClassNumber() + "\n" +
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
//        return grade;
    }

    @Override
    public int totalMarks(ArrayList<Integer> marks) {
        return marks.stream().mapToInt(v -> v).sum();
    }

    @Override
    public double averageGrade(int totalMarks, int length) {
        return (double) totalMarks / (double) length;
    }

    @Override
    public String letterGrade(double avgGrade) {
        if (avgGrade > 95) {
            return "A+";
        } else if (avgGrade >= 90) {
            return "A";
        } else if (avgGrade >= 80) {
            return "B";
        } else if (avgGrade >= 70) {
            return "C";
        } else if (avgGrade >= 60) {
            return "D";
        } else {
            return "F";
        }    }

//    public int getStudent() {
//        return student;
//    }
//
//    public void setStudent(int student) {
//        this.student = student;
//    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }
}
