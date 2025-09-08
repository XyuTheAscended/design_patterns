package decorator;

import java.util.ArrayList;
/**
 * @author Tyler Norman
 */
public abstract class ScoopDecorator extends IceCream{
    /**
     * Variables to make the icecream scoops appear on the screen.
     */
    protected IceCream iceCream;
    protected int numFlavorScoops;
    private static int space = 0;
    private static int dash = 10;

    /**
     * Constructor for the arraylist to customize the scoops
     * @param iceCream
     * @param numScoops
     * 
     */
    public ScoopDecorator(IceCream iceCream, int numScoops){
        this.iceCream = iceCream;
        this.numFlavorScoops = numScoops;
        this.asciiArt = new ArrayList<>(iceCream.asciiArt);
    }
    /**
     * Decorate is the helper method to repeat the scoops and print them on top of the icecream cone.
     * @param color
     * @param numScoops
     */
    protected void decorate(String color, int numScoops){
        for(int i = 0; i < numFlavorScoops; i++){
            asciiArt.addFirst(color +" ".repeat(space) +"(" + "-".repeat(dash)+")"+ ANSI_RESET);
            dash -= 2;
            space += 1;

        }
    }
}
