package Session10;

import java.util.ArrayList;

public class User {

    private String username;
    private ArrayList<Integer> scores;
    private String password;
    private int id;

    public User(int id, String username, String password, ArrayList<Integer> scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
