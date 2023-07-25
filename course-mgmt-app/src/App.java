import controller.CourseController;

public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        courseController.addCourse(null);
        courseController.updateCourse(null);
        courseController.deleteCourse(1);
        courseController.getAllCourses();
    }
}
