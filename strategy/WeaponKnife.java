package strategy;
//Extending the WeaponKnife to WeaponBehavior since WeaponBehavior is the parent class.
public class WeaponKnife extends WeaponBehavior {
    public void attack(){ // inherits/takes the abstract method from WeaponBehavior class.
        //make a for loop so the animation can go across screen.
        for(int i = 0; i<75; ++i){ //i variable acts as timer when it shoots across the screen
            Resources.clear();
            for(int j = 0; j<i; ++j){ // j variable is what adds the space to make it look like its moving
                System.out.print(" ");
            }
            System.out.print("-|==>");
            Resources.sleep(60); //This is the increment in milliseconds before it moves across the screen another frame
        }
        System.out.println("\nYou threw the knife AWESOME!"); //Prints out the line after you complete the animation.
    }
}
