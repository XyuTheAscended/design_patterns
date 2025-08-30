package observer;

public class Watchman extends Subject{
    /**
     * 
     * Issue notice has the same function as greeter except it sounds a trumpet for a warning about an attack or intrusion
     */
    public void issueNotice(int note){
        System.out.println("The trumpet roared "+note+" time(s)");
        notifyObservers(note);
    }
    /** 
     * 
     * Plays the trumpet sound for the warning being true and updates the observers to make them evacuate.
    */
    public void notifyObservers(int note){
        updateObserver(true, note);
        Trumpet.play(true, note);
    }
}
