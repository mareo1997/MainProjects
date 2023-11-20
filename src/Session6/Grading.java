package Session6;

import java.util.ArrayList;

public interface Grading {

    int totalMarks(ArrayList<Integer> marks);

    double averageGrade(int totalMarks, int length);

    String letterGrade(double avgGrade);

}
