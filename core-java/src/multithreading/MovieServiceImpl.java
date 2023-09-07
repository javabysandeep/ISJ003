package multithreading;

public class MovieServiceImpl implements MovieService {
    @Override
    public void playMovie() {
        System.out.println("playing the movie");
    }

    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl();
        movieService.playMovie();

        MovieService anon = new MovieService() {
            @Override
            public void playMovie() {
                System.out.println("playing anonymous movie");
            }
        };
        anon.playMovie();
    }
}
