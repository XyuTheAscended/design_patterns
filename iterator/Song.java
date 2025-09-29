package iterator;

/**
 * @author Tyler Norman
 * This class gets the name of the artist the genre of music and the length of the songs
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

/**
 * makes the constructors params have the same value as the class variables
 * @param name
 * @param artist
 * @param length
 * @param genre
 */
public Song(String name, String artist, double length, Genre genre){
    this.name = name;
    this.artist = artist;
    this.length = length;
    this.genre = genre;
}

/**
 * Tells the descriptions of the songs.
 */
@Override
public String toString(){
    return name + " by " + artist + " category: " + genre + " length: " + length + " min";
}

}