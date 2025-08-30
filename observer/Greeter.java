package observer;

public class Greeter extends Subject{
    /**
     * 
     * The issue notice method is what notifies the observers letting them know how many times the fanfare sounded.
     * Its a fanfare because greeter is a good sign of somebody important or somebody entering the city that isnt an enemy
     */
    public void issueNotice(int note){
        System.out.println("The fanfare has sounded "+note+" time(s)");
        notifyObservers(note);  
    }
    /**
     *  Plays the fanfare and updates the observers to do an action when the warning is false.
     */
    public void notifyObservers(int note){
        updateObserver(false, note);
        Trumpet.play(false, note);

    }

}
