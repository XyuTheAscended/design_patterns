package decorator;

import java.util.ArrayList;

/**
 * @author Tyler Norman
 */
public abstract class IceCream {
    /**
     * Constant color variables.
     */
    public static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_BROWN = "\u001B[38;5;130m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    /**
     * Arraylist for the cone
     */
    protected ArrayList<String> asciiArt = new ArrayList<>();
    protected int numScoops;

    /**
     * This prints the cone properly so it aligns with the scoops.
     */
    public String toString() {
        String cone = "";
        for (int i = 0; i < asciiArt.size(); ++i) {
            cone += ANSI_BROWN + asciiArt.get(i) + ANSI_RESET + "\n";
        }
        return cone;
    }
}
