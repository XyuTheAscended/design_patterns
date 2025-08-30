package observer;

public class ShopOwner implements Observer{
    /**
     * 
     * @param watchman
     * @param Greeter
     * registers the Shop owner as an observer for the greeter and watchman
     */
    public ShopOwner(Subject watchman, Subject Greeter){
        watchman.registerObserver(this);
        Greeter.registerObserver(this);
    }
    
    /**
     * In update method it updates the observer if the warning is true or false.
     */
    public void update(boolean warning, int note){
        if(!warning){
            switch(note){
                case 1: System.out.println("The shop owner waves at the messenger and continues to put up his discount sign.");
                break;
                case 2: System.out.println("The shop owner stares in amazement at the King's approach and takes off his hat and bows before him as the King brushes by.");
                break;
            }
        } else {
            switch(note){
                case 1: System.out.println("The shop owner flees to the inner walls of the city so the military can fend off the attackers.");
                break;
                case 2: System.out.println("The shop owner takes all his little belongings along with food and water and runs out of the exit from the city to another unkown location.");
                break;
            }
        }
    }
}
