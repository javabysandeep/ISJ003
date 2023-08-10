package oops.inheritance.superKeyword;

public class C extends B {
    int x = 100;
    void display(){
        //int x = 1000;
        System.out.println("Local variable of C:display() "+x);//1000
        System.out.println("Instance variable of C class "+this.x);//100
        System.out.println("Super class of C class : Instance variable  "+super.x);//10
    }

}
