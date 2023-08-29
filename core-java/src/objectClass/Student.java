package objectClass;

public class Student {
    int id;
    String name;

    //copy constructor or clone constructor
    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
      /*  Student student = new Student(1,"Salman");
        System.out.println(student);
        System.out.println(student.toString());*/

        Student student1 = new Student(1, "Salman");
        Student student2 = new Student(student1);
    }
}
