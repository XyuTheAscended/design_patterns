package decorator;
/**
 * @author Tyler Norman
 */
public class Strawberry extends ScoopDecorator {
    /**
     * Constructor takes the helper method decorate to change color and print the scoops to the console.
     * @param iceCream
     * @param numScoops
     */
    public Strawberry(IceCream iceCream, int numScoops){
        super(iceCream, numScoops);
        decorate(ANSI_RED, numScoops);
    }
}
