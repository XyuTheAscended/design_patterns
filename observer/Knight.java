package observer;

public class Knight implements Observer{
   /**
    * 
    * @param watchman
    * @param Greeter
    registers knight as observer for watchman and greeter
    */
    public Knight(Subject watchman, Subject Greeter){
        watchman.registerObserver(this);
        Greeter.registerObserver(this);
   }
   /**
    *
    * @param warning
    * @param notes
    In the update method we have the if else statement to play the fanfare if there is no threat and the trumpet if there is a threat.
    */ 
   public void update(boolean warning, int note){
    if(!warning){
        switch(note){
            case 1: System.out.println("The knight reamins steadfast at his post still watching over the city.");
            break;
            case 2: System.out.println("The knight kneels before the King along with his fellow knights in respect and honor for him.");
            break;
        }
    } else {
        switch(note){
            case 1: System.out.println("The knight along with his squadron rush to the front of the city to fend it off from the army.");
            break;
            case 2: System.out.println("After the knight watched many of his brothers lose their lives, he still does not go down without a fight and protects the city with his life.");
            break;
        }
    }
    }
}
