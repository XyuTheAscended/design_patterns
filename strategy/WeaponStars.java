package strategy;
//Extending the WeaponStars to WeaponBehavior since WeaponBehavior is the parent class.
public class WeaponStars extends WeaponBehavior{
    public void attack(){
        System.out.println("You're throwing ninja stars oh yeah!!!"); //Excites you for throwing ninja stars and prints it to the console.
        for(int i = 0; i<100; ++i){ //Make a for loop so it loops the ninja starts being throw to the console.
            System.out.print("*" + " ");
            Resources.sleep(45);//Delays each ninja star so it doesnt just appear all of them and look weird.
        }
    }
}
