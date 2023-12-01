package Session10;

import java.util.ArrayList;

public class User {

    private String username;
    private ArrayList<Integer> scores;
    private String password;
    private int id;
    private UserQuizes userQuiz;

    public User(int id, String username, String password, ArrayList<Integer> scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password, UserQuizes userQuiz) {
        this.id = id;
        this.userQuiz = userQuiz;
        this.username = username;
        this.password = password;

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public UserQuizes getUserQuiz() {
        return userQuiz;
    }

    public void setUserQuiz(UserQuizes userQuiz) {
        this.userQuiz = userQuiz;
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
