package oops.inheritance.scenario3;

public class ChildObjectParentReference {
    public static void main(String[] args) {
        //Scenario 3 :parent class reference and child class object
        //case 1 : only present in Parent --> Parent
        //case 2 : only present in child ---> Compile Time Error
        //case 3 : present in both parent and child --> variable -Parent [method-child]

        Parent parent = new Child();
        System.out.println(parent.variable);//Parent
        parent.method();//child

//        Child child = new Parent();//CTE

    }
}
