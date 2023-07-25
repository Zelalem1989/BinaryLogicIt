package exceptionHandling;

public class Person {
    private String name;

    private String Lastname;

    public Person(String name, String lastname) {
        this.name = name;
        Lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                '}';
    }
}
