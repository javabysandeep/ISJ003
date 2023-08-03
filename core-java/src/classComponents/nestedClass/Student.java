package classComponents.nestedClass;

public class Student {
    int studentId;
    String name;
    class Address {
        String street;
        String city;
        String state;
    }


    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Amol");
        Student.Address address1 = student1.new Address();
        Student.Address address2 = student1.new Address();

    }
}
