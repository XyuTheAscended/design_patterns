package strategy;
//Makes the class abstract because its italisized in the UML
public abstract class WeaponBehavior {
    //Makes the speed private as shown in the UML so the speed can make the animation
    private int speed;
//Sets attacks for weapon behaviors. Was told on UML to be abstract but has to be abstract so only the extended classes can inherit.
    public abstract void attack();


}
