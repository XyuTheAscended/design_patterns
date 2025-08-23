package strategy;
/*
 * Abstract so the extended classes can inherit from it
 */
public abstract class Character {
   protected String name; //This sets the variable for the name that you enter.
  private WeaponBehavior weaponBehavior; //This construct
    
   public Character(String name){ //This is for the character's name.
    this.name = name;
   }
    public void attack(){ // This is for the attack method so the attack youre going to pick can play to console.
        weaponBehavior.attack();
    }
   public void setWeaponBehavior(WeaponBehavior weaponBehavior){ //Creates method for Weaponbehavior so it an pick up the weapons behavior that you pick.
    this.weaponBehavior = weaponBehavior;
   }

public abstract String toString(); //This is abstract so the sub classes can extend this toString method.
}
