package classComponents.thisKeyword;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();// 0, null, null
        student.setStudentId(101);
        student.setStudentName("salman");
        student.setStudentAddress("Mumbai");

        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentAddress());

    }
}
