package Session10;

import java.util.ArrayList;

public class UserQuizes {


    private int id;
    private ArrayList<String> test;

    public UserQuizes() {

    }

    public UserQuizes(ArrayList<String> test) {

        this.test = test;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("You have to do the following test before deadline\n");

        for(String t: test){
            result.append(t).append("\n");
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
