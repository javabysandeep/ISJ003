package app;

import model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Course course1 = applicationContext.getBean("course", Course.class);
        Course course2 = applicationContext.getBean("course", Course.class);
        System.out.println("Course 1 " + course1.hashCode());
        System.out.println("Course 2 " + course2.hashCode());
    }
}
