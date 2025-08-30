package observer;

public class Teacher implements Observer{
   /**
    * 
    * @param watchman
    * @param Greeter
    registers the Teacher as an observer for the greeter and watchman
    */
    public Teacher(Subject watchman, Subject Greeter){
        watchman.registerObserver(this);
        Greeter.registerObserver(this);
    }
    
     /**
      * 
      This if statement has the same function for shopowner and Knight and prints what the teacher will do when the trumpet or fanfare are sounded a certain amount of times.
      */
    public void update(boolean warning, int note){
        if(!warning){
            switch(note){
                case 1: System.out.println("The teacher waits for the messenger and contiues his/her important duties afterwards.");
                break;
                case 2: System.out.println("The teacher points out the window and says 'Look there goes the King!' to his/her students as they look in awe.");
                break;
            }
        } else {
            switch(note){
                case 1: System.out.println("The teacher evacuates his/her students and takes them to the inner walls of the city for protection from the army that is approaching.");
                break;
                case 2: System.out.println("The teacher tries to lead his/her students to the outside of the city protecting them with his/her life!");
                break;
            }
        }
    }
}
