package classComponents;

public class Student {
    int id;//instance primitive
    String name;//instance reference
    static String collegeName = "PU"; //static reference variable
    static int studentCount = 100; //static primitive variable
    int marks;

    public static void main(String[] args) {
        //args : local reference variable
        Student student = new Student();//student : local reference variable
        int average = 100;//local primitive variable
        System.out.println(average);

    }
}
