import controller.CourseController;
import model.Course;

import java.util.List;

public class CourseApp {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        Course course = Course.builder()
                .id(2)
                .name("Fullstack Java")
                .price(500)
                .build();
        courseController.addCourse(course);

        List<Course> courseList = courseController.getAllCourses();
        courseList.forEach(System.out::println);
    }
}
