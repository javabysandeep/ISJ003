package classComponents.methods;

public class Student {
    int studentId; // instance
    String studentName; //instance
    static String collegeName = "Pune"; // static

    //sid is local variable
    //setStudentId : is instance method
    public void setStudentId(int sid) {
        studentId = sid;// assigning local variable to instance variable
    }

    //getStudentId : instance method
    public int getStudentId() {
        return studentId;
    }

    //method definition
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.println(add(100,200));//method cal
    }
}
