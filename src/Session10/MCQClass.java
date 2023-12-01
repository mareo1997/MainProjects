package Session10;

public class MCQClass implements b {

    @Override
    public int tests(String s) {
        int points = 0;

        switch (s.toUpperCase()) {
            case "JAVA" -> {
                Java java = new Java();
                points = java.question();
            }
            case "HTML" -> {
                HTML html = new HTML();
                points = html.question();
            }
            case "CSS" -> {
                CSS css = new CSS();
                points = css.question();
            }
        }
        return points;
    }

}
