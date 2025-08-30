package observer;
import java.util.ArrayList;
public abstract class Subject {
    protected ArrayList<Observer> observers;
    
    /**
     * Sets the arraylist of observers in the constructor
     */
    public Subject(){
        observers = new ArrayList<Observer>();
    }
    /**
     * This adds observers to the observer array list.
     * @param observer
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    /**
     *  Remoes observers from the observer array list.
     * @param observer
     */
    public  void removeObserver(Observer observer){
        observers.remove(observer);
    }
    /**
     * This updates observers and makes it easier to update observers in the greeter and watchman class since they extend from Subject.
     * @param warning
     * @param note
     */
    protected void updateObserver(boolean warning, int note){
        for(Observer observer : observers){
            observer.update(warning, note);
        }
    }
    /**
     * issueNotice method is what issues the notice of note and tells how many times the trumpet or fanfare has sounded.
     * @param note
     */
    public abstract void issueNotice(int note);
    /**
     * notifyObservers method is what notifies the observers in the child classes of Subject and the int note in the parameter is for when the sound plays from the trumpet
     * @param note
     */
    public abstract void notifyObservers(int note);


}
