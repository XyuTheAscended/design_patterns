package strategy;
//Extending the WeaponBow to WeaponBehavior since WeaponBehavior is the parent class.
public class WeaponBow extends WeaponBehavior{
    public void attack(){ // inherits/takes the abstract method from WeaponBehavior class.
        for(int i = 0; i<150; ++i){ //Same as WeaponKnife class
            Resources.clear(); //clears to allow animation to run
            System.out.print("D"); //used D to make it look like the bow and the string to the bow
            for(int j = 0; j<i; ++j){
                System.out.print(" ");

            }
            
            System.out.print("-->");
            Resources.sleep(15); //Make the increment of milliseconds small for this one because an arrow is faster than a knife.
        }
        System.out.println("\nYou shot an arrow from a bow that arrow is pretty fast!"); //Even says you shoot the arrow pretty fast after the animation.
    }

    
    
}
