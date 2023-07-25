package classComponents.constructor;

public class Student {
    int studentId;
    String studentName;
    String email;
    int phone;
    String address;

    //zero parameterized
    public Student() {
    }

     public Student(int studentId, String studentName, String email, int phone, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Salman", "salmna@gmail.com", 898989, "Pune");
        Student student2 = new Student(102, "Javed", "Javed@gmail.com", 898989, "Pune");
    }
}
