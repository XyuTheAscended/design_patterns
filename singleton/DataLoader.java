/**
 * @author Tyler Norman
 * This class is meant to load songs from the text file and songs provided
 */
package singleton;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DataLoader {
    /**
     * Reads the text file of songs and returns as an arraylist
     * @return
     */
    public static ArrayList<Song> getSongs(){
        ArrayList<Song> songs = new ArrayList<>(); 
        File file = new File("/Users/xyutakiashi/design_patterns/singleton/songs.txt");
        if(!file.exists()){
                System.out.println("Cannot find songs.txt");
                return songs;
            }
        try (BufferedReader read = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = read.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String title = parts[0].trim();
                    String artist = parts[1].trim();
                    String filePath = parts[2].trim();
                    songs.add(new Song(title, artist, filePath));
                }
            }

        } catch (Exception e) {
            System.out.println("Error loading the songs: " + e.getMessage());
        }
        return songs;
    }
}
