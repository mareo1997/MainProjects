package Session10.MCQ;

import Session10.Question.CSS;
import Session10.Question.HTML;
import Session10.Question.Java;

public class MCQListImpl implements MCQList {

    @Override
    public int testList(String s) {
        int points = 0;

        switch (s.toUpperCase()) {
            case "JAVA" -> {
                Java java = new Java();
                points = java.questionsForTest();
            }
            case "HTML" -> {
                HTML html = new HTML();
                points = html.questionsForTest();
            }
            case "CSS" -> {
                CSS css = new CSS();
                points = css.questionsForTest();
            }
        }
        return points*10;
    }

}
