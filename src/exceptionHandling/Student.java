package exceptionHandling;

public class Student extends Person{

    private double grade;

    public Student(String name, String lastname, double grade) {
        super(name, lastname);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}
