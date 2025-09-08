package decorator;
/**
 * @author Tyler Norman
 */
public class BlueBerry extends ScoopDecorator {
    /**
     * @param iceCream
     * @param numScoops
     * Constructor takes the helper method decorate to change color and print the scoops to the console.
     */
    public BlueBerry(IceCream iceCream, int numScoops){
        super(iceCream, numScoops);
        decorate(ANSI_BLUE, numScoops);
    }
}
