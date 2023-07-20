package classComponents.assignments;

public class Student {
    int rollNumber;
    String name;

    public static void main(String[] args) {
        Student studentJohn = new Student();
        studentJohn.rollNumber = 2;
        studentJohn.name = "John";

        Student studentSam = new Student();
        studentSam.rollNumber = 3;
        studentSam.name = "Sam";

        System.out.println("Johns details " + studentJohn.rollNumber + "\t" + studentJohn.name);
        System.out.println("Sam details " + studentSam.rollNumber + "\t" + studentSam.name);
    }
}
