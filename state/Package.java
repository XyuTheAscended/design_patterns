package state;
/**
 * @author Tyler Norman
 */

public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * Package constructor is to make the package and its states
     * @param name
     * @param quantity
     */
    public Package(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
        orderedState = new OrderedState(this);
        inTransitState = new InTransitState(this);
        deliveredState = new DeliveredState(this);


        state = orderedState;

    }

    /**
     * This returns orderedState class and its messages for the delivery
     * @return
     */
    public String order(){
        setState(orderedState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * This returns inTransitState class and its messages for the delivery
     * @return
     */
    public String mail(){
        setState(inTransitState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * This returns deliveredState class and its messages for the delivery
     * @return
     */
    public String received(){
        setState(deliveredState);
        return state.getStatus() + "\n" + state.getETA();
    }
    
    /**
     * This is helper method to set the state.
     * @param state
     */
    public void setState(State state){
        this.state = state;
    }

    /**
     * This string returns the name of the package that you named
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * This string method is to make sure the grammar is correct for plural and singular verbs.
     * @param singular
     * @param plural
     * @return
     */
    public String getVerb(String singular, String plural){
        return (quantity == 1 ? singular : plural);
    }
    
}
