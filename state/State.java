package state;
import java.util.Random;
/**
 * @author Tyler Norman
 */


public abstract class State {
    protected Package pkg;
    protected Random random;

    /**
     * Takes the package and makes it random
     * @param pkg
     */
    public State(Package pkg){
        this.pkg = pkg;
        this.random = new Random();
    }

    /**
     * Abstract so each state describes their status
     * @return
     */
    public abstract String getStatus();

    /**
     * Abstract so each state describes their ETA's
     * @return
     */
    public abstract String getETA();

}
