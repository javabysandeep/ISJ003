package oops.abstraction.abstractClassdemos;

public class AccessingAbstractMembers {
    public static void main(String[] args) {
        System.out.println(MusicService.staticVariable);
        MusicService.staticMethod();

        // MusicService musicService = new MusicService();
         MusicService musicService = new MusicServiceImpl();
         musicService.play();
    }
}
