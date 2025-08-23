package strategy;
//Extending the WeaponNone to WeaponBehavior since WeaponBehavior is the parent class.
public class WeaponNone extends WeaponBehavior {
    public void attack(){// Since you dont have a weapon it just prints you dont have a weapon and you should run.
        System.out.println("You dont have a weapon. Just run away!");
    }
    
}
