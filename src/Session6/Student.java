package Session6;

public class Student {

    private String name;

    private int id;

    private String classNumber;

    public Student(String name, int id, String classNumber) {
        this.name = name;
        this.id = id;
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", classNumber='" + classNumber + '\'' +
                '}';
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

}
