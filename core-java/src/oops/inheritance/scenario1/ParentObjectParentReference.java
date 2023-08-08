package oops.inheritance.scenario1;

public class ParentObjectParentReference {
    public static void main(String[] args) {

        //Scenario 1 :parent class reference and Parent class object
        //case 1 : only present in Parent --> Parent
        //case 2 : only present in child ---> Compile Time Error [ nothing can be accessed from child class]
        //case 3 : present in both parent and child --> Parent

        Parent parent = new Parent();
        System.out.println(parent.variable);
        parent.method();

        // we can access only from parent class not from child
    }
}
