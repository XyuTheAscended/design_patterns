package state;
/**
 * @author Tyler Norman
 */

public class InTransitState extends State {
    private int days;
    private boolean delay;

    /**
     * super(pkg) in here so it takes pkg variable from super/parent class
     * days is 5 since thats the base shipping days and delay is another if to have a chance of the delay happening
     * @param pkg
     */
    public InTransitState(Package pkg){
        super(pkg);
        this.days = 5;

        this.delay = random.nextInt(100) < 30;
        if(delay){
            days += random.nextInt(7) + 1;
        }
    }
    /**
     * Make a status string variable to tell you the status of the package and to check the verb for grammar and the name of your package that you make
     */
    @Override
    public String getStatus(){
        String status = "The " + pkg.getName() + " " + pkg.getVerb("is", "are") + " ordered.";
        if(delay){
            status += "\nThe " + pkg.getName() + " " + pkg.getVerb("has", "have") + " experienced a delay in shipping.";
        }
        return status;
    }

    /**
     * Tells the user the ETA of their package after all the calculation/information gathering is done.
     */
    @Override
    public String getETA(){
        return "The " + pkg.getName() + " should arrive within " + days + " business days.";
    }
}
