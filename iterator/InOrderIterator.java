package iterator;
import java.util.Iterator;
/**
 * @author Tyler Norman
 * This class is the InOrderIterator and its function is to put the songs in order
 */

public class InOrderIterator implements Iterator<Song> {
    private Song[] song;
    private int position;

/**
 * This constructor makes the InOrderIterator object
 * @param songs
 */
public InOrderIterator(Song[] songs){
    this.song = songs;
    this.position = 0;
}

/**
 * returns the postion of the songs in the list to make it in order
 * @return
 */
public boolean hasNext(){
    return position < song.length && song[position] != null;
}

/**
 * returns the song positions and has ++ to add the songs in order with the number of them.
 * @return
 */
public Song next(){
    return song[position++];
}

}