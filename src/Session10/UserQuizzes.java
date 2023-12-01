package Session10;

import java.util.ArrayList;

public class UserQuizzes {

    private int id;
    private ArrayList<String> test;

    public UserQuizzes(ArrayList<String> test) {

        this.test = test;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("You have to do the following tests before deadline\n");
        int index = 0;
        for (String t : test) {
            index += 1;
            result.append(index).append(" ").append(t).append("\n");
        }

        return result.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getTest() {
        return test;
    }

    public void setTest(ArrayList<String> test) {
        this.test = test;
    }

}
