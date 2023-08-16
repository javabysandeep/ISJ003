package oops.abstraction.abstractClassdemos;

public class MusicServiceImpl extends MusicService {
    @Override
    void play() {
        System.out.println("overridden method");
    }

    MusicServiceImpl(){
        //1. check super class constructor call
        //2. instance block
        // super();
        System.out.println("music service impl constructor");

    }
}
