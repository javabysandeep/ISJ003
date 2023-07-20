package classComponents.assignments;

public class Question1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();//length=0, breadth=0
        System.out.println("Instance variable "+ rectangle.length);
        System.out.println("Instance variable "+ rectangle.breadth);

        rectangle.length = 100;
        rectangle.breadth = 200;

        System.out.println("Instance variable "+ rectangle.length);
        System.out.println("Instance variable "+ rectangle.breadth);

        rectangle.setDimension(300, 600);

        System.out.println("Instance variable "+ rectangle.length);
        System.out.println("Instance variable "+ rectangle.breadth);

        System.out.println("Area of Rectangle "+rectangle.getArea());
    }
}
