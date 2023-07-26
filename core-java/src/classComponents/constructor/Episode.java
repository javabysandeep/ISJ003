package classComponents.constructor;

public class Episode {
    int episodeId;
    String episodeTitle;

    public Episode() {
    }

    public Episode(int episodeId, String episodeTitle) {
        this.episodeId = episodeId;
        this.episodeTitle = episodeTitle;
    }

    //copy constructor
    public Episode(Episode episode) {
        this.episodeId = episode.episodeId;
        this.episodeTitle = episode.episodeTitle;
    }

    public static void main(String[] args) {
        Episode episode1 = new Episode(1, "Class Components");// param
        Episode episode2 = new Episode(episode1); // call to copy constructor

        System.out.println("Episode1 " + episode1.episodeId + "\t" + episode1.episodeTitle);
        System.out.println("Episode2 " + episode2.episodeId + "\t" + episode2.episodeTitle);
    }

}
