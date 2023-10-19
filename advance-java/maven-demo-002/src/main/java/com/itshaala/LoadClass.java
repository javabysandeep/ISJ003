package com.itshaala;

public class LoadClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. load the class in the memory by creating the object
       // Main m =new Main();
        //2. load the class in the memory by using Class.forName(className);
        Class.forName("com.itshaala.Main");
    }
}
