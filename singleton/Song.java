/**
 * @author Tyler Norman
 * This class is meant to get the title, artist, and filepath of the song.
 */
package singleton;

public class Song {
    private String title;
    private String artist;
    private String filePath;

    /**
     * Constructs the song
     * @param title
     * @param artist
     * @param fileName
     */
    public Song(String title, String artist, String fileName){
        this.title = title;
        this.artist = artist;
        this.filePath = fileName;
    }

    /**
     * Returns the string of the song so pretty much the name of it and the artist.
     */
    public String toString(){
        return title + " by " + artist;
    }

    /**
     * plays the song throguh songplayer
     */
    public void play(){
        SongPlayer.play(filePath);
    }

}
