import java.util.Collections;
import java.util.LinkedList;

public class Song implements Comparable<Song> {
    private String title;
    private String Artist;
    private double duration;

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", Artist='" + Artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    private LinkedList<Song> Playlist = new LinkedList<>();
    public Song(String title, String artist, double duration) {
        this.title = title;
        Artist = artist;
        this.duration = duration;

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return Artist;
    }

    public double getDuration() {
        return duration;
    }

    public void addSong(Song s){
        Playlist.add(s);
    }

    public void removeSong(Song s){
        Playlist.remove(s);
    }

    public void playPlaylist(){
        for (Song s : Playlist) {
            System.out.println(s.toString());
        }
    }

    public void shufflePlaylist(){
        Collections.shuffle(Playlist);
    }

    public void sortByDuration(){
        Collections.sort(Playlist);
    }

    public void durationOfPlaylist(){
        double sum = 0;
        for (Song s: Playlist) {
            sum += s.getDuration();
        }
        System.out.println("The duration of the playlist is " + sum);
    }

    @Override
    public int compareTo(Song o) {
        if(o.getDuration() > duration){return -1;}
        else if (o.getDuration() == duration){return 0;}
        else {return 1;}
    }
}

