package Session10;

import java.util.ArrayList;

public class User {

    private String username;
    private ArrayList<Integer> scores;
    private String password;
    private int id;
    private UserQuizzes userQuiz;

//    public User(int id, String username, String password, UserQuizzes userQuiz) {
//        this.id = id;
//        this.userQuiz = userQuiz;
//        this.username = username;
//        this.password = password;
//        this.scores = scores;
//    }

    public User(int id, String username, String password, UserQuizzes userQuiz, ArrayList<Integer> scores) {
        this.id = id;
        this.userQuiz = userQuiz;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", scores=" + scores +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", userQuiz=" + userQuiz +
                '}';
    }

    public UserQuizzes getUserQuiz() {
        return userQuiz;
    }

    public void setUserQuiz(UserQuizzes userQuiz) {
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
