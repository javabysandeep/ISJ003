package dao;

import model.Course;

import java.util.List;

public class CourseDao {
    public void addCourse(Course course) {
        System.out.println("Course added");
    }

    public void updateCourse(Course course) {
        System.out.println("course updated");

    }

    public void deleteCourse(int courseId) {
        System.out.println("course deleted " + courseId);
    }

    public List<Course> getAllCourses() {
        System.out.println("All courses");
        return null;
    }
}
