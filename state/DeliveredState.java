package state;
/**
 * @author Tyler Norman
 */

public class DeliveredState extends State {
    /**
     * super(pkg) in here so it takes pkg variable from super/parent class
     * @param pkg
     */
    public DeliveredState(Package pkg){
        super(pkg);
    }

    /**
     * Tells the user when the package has arrived
     */
    @Override
    public String getStatus(){
        return "The " + pkg.getName() + " " + pkg.getVerb("has", "have") + " arrived.";
    }
    /**
     * Tells the user the ETA of their package after all the calculation/information gathering is done.
     */
    @Override
    public String getETA(){
        return "The " + pkg.getName() + " " + pkg.getVerb("is", "are") + " here.";
    }
}
