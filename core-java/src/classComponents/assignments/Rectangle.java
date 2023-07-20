package classComponents.assignments;

public class Rectangle {
    int length;
    int breadth;
    static int a = 1000;

    void setDimension(int l, int b) {
        length = l;
        breadth = b;
        a= 1;
    }

    int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        /*length=100;
        breadth = 200;*/
        a = 1;
    }
}
