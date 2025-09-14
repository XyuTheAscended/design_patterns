package state;
/**
 * @author Tyler Norman
 */

public class OrderedState extends State {
    private int days;
    private boolean delay;

    /**
     * super(pkg) in here so it takes pkg variable from super/parent class
     * this.days is to set the average amount of days for the order and the delay is an if statement so there is a chance of the delay happening
     * @param pkg
     */
    public OrderedState(Package pkg){
        super(pkg);
        this.days = 2;

        this.delay = random.nextInt(100) < 20;
        if(delay){
            days += random.nextInt(3) + 1;
        }
    }

     /**
      * Make a status string variable to tell you the status of the package and to check the verb for grammar and the name of your package that you make
      */
    @Override
    public String getStatus(){
        String status = "The " + pkg.getName()+ " " + pkg.getVerb("is", "are") + " ordered";
        if(delay){
            status += "\nThe " + pkg.getName() + " " + pkg.getVerb("has", "have") + " experienced a delay in manufacturing.";
        }
        return status;
    }

    /**
     *  Tells the user the ETA of their package after all the calculation/information gathering is done.
     */
    @Override
    public String getETA(){
        return "The " + pkg.getName() + " will be shipped within " + days + " business days";
    }
}
