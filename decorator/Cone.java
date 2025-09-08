package decorator;
/**
 * @author Tyler Norman
 */

public class Cone extends IceCream {
    /**
     * Cone constructor to read the file
     */
    public Cone(){
        asciiArt = FileReader.getLines("decorator/cone.txt/");
        super.numScoops = 0;
    }

}
