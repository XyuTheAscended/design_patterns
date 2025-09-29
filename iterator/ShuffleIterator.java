package iterator;
import java.util.Iterator;
import java.util.Random;

/**
 * @author Tyler Norman
 * This ShuffleIterator class is an iterator that shuffles the Songs in no particular order but random which is why Random is imported.
 */
public class ShuffleIterator implements Iterator<Song> {
    private Song[] song;
    private Random rand;

/**
 * Makes the constructor so it becomes an object that shuffles the songs
 * @param songs
 */
public ShuffleIterator(Song[] songs){
    this.song = songs.clone();
    this.rand = new Random();

    for(int i = song.length - 1; i > 0; i--){
        if (song[i] == null) continue;
        int j = rand.nextInt(i + 1);
        Song temp = song[i];
        song[i] = song[j];
        song[j] = temp;
    }
}

/**
 * Overrides hasNext to make it true for the songs listed so it doesnt try to count below or past the amount of songs given.
 */
@Override
public boolean hasNext(){
    for(int i = 0; i < song.length; i++){
        if (song[i] != null) return true;
    }
    return false;
}

/**
 * Gets the next song in the list to randomize
 */
public Song next(){
    for(int i = 0; i < song.length; i++){
        if (song[i] != null){
            Song nextSong = song[i];
            song[i] = null;
            return nextSong;
        }
    }
    return null;
}

}