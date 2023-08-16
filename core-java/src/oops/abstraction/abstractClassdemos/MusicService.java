package oops.abstraction.abstractClassdemos;

public abstract class MusicService {
    int instanceVariable = 100;
    static int staticVariable = 1000;

   private void instanceMethod(){
        System.out.println("instance method from abstract class");
    }

    static void staticMethod(){
        System.out.println("static method from abstract class");
    }
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }
    MusicService(){
        //1. check super class constructor call
        //2. instance block
        System.out.println("abstract class constructor");
    }

    abstract void play();
}
