package students;

public class Student {

    private int studentId;
    private String name;
    private String email;
    private double grade;

    public Student(int studentId, String name, String email, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getGrade() {
        return grade;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", grade=" + grade +
                '}';
    }
}
