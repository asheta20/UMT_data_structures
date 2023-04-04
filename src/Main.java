import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        WorkFrequencyCounter a = new WorkFrequencyCounter();
        try {
            a.populateList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        a.getUniqueList();
        a.checkFrequency();
        a.printFrequency();

        // Exercise 2

        // Exercise 3
        Song s1 = new Song("Active", "Mupp", 1.45);
        Song s2 = new Song("Mentalite", "Baby Gang", 2.45);
        Song s3 = new Song("Sandstorm", "Darude", 3.10);

        //Adding songs
        s1.addSong(s1);
        s1.addSong(s2);
        s1.addSong(s3);

        //Removing Songs
        s1.removeSong(s2);

        //Playing playsilt ect
        s1.playPlaylist();
        s1.shufflePlaylist();


    }
}