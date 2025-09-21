/**
 * @author Tyler Norman
 * This class is what plays the jukebox and makes the singleton instance so the jukebox can play through Musicdriver.java
 */
package singleton;
import java.util.ArrayList;
public class JukeBox {
    private static JukeBox jukeBox;
        private ArrayList<Song> songs;

        /**
         * Loads dataloader to get the songlist
         */
        private JukeBox()
        {
            songs = DataLoader.getSongs();
        }
        
        /**
         * 
         * @return singleton Jukebox instance
         */
        public static JukeBox getInstance(){
            if (jukeBox == null){
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * 
     * @return songs based off the arraylist to get the songs
     */
    public ArrayList<Song> getAllSongs(){
        return songs;
    }

/**
 * Plays the song at given index.
 * @param num
 */
    public void requestSong(int num){
        if (num < 0 || num >= songs.size()){
            System.out.println("This is not the right song selection try again.");
            return;
        }
        Song song = songs.get(num);
        System.out.println("Now playing: " + song);
        song.play();
    }
}
