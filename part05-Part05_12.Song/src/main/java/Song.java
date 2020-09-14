
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    public boolean equals(Object song) {

        if(this == song) {
            return true;
        }

        if(!(song instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) song;

        if (this.artist.equals(comparedSong.artist)
                && this.name.equals(comparedSong.name) 
                && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        return false;
        
    }


}
