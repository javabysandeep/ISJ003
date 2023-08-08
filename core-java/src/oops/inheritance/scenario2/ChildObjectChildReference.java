package oops.inheritance.scenario2;

public class ChildObjectChildReference {
    public static void main(String[] args) {
        //Scenario 2 :child class reference and child class object
        //case 1 : only present in Parent --> Parent
        //case 2 : only present in child ---> Child
        //case 3 : present in both parent and child --> Child

        Child child = new Child();
        System.out.println(child.variable);//child variable
        child.method();//child method

    }
}
