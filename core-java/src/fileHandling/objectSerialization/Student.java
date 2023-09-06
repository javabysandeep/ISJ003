package fileHandling.objectSerialization;

import java.io.Serializable;

public class Student implements Serializable {
    public int id;
    public String username;
    transient public String password;

    public Student(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Student() {
    }
}
