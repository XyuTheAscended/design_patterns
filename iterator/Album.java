package iterator;

import java.util.Iterator;

/**
 * @author Tyler Norman
 * 
 */
public class Album {
    private Song[] songs;
    private int count;
    private String name;

/**
 * Album constructor
 * @param name
 */
public Album(String name){
    this.name = name;
    this.songs = new Song[20];
    this.count = 0;
}

/**
 * adds the songs to the list when put in order or shuffle
 * @param name
 * @param artist
 * @param length
 * @param genre
 * @return
 */
public boolean addSong(String name, String artist, double length, Genre genre){
    if (count < songs.length) {
        songs[count++] = new Song(name, artist, length, genre);
        return true;
    }
    return false;
}

/**
 * gets the InOrder iterator
 * @return
 */
public Iterator<Song> createInOrderIterator(){
 return new InOrderIterator(songs);
}

/**
 * gets the Shuffle iterator
 * @return
 */
public Iterator<Song> createShuffleIterator(){
    return new ShuffleIterator(songs);
}

/**
 * gets the name of the songs.
 * @return
 */
public String getName(){
    return name;
}

}