package strategy;
//Extending the Troll to Character since Character is the parent class.
public class Troll extends Character {
    public Troll(String name){ // Allows you to take the name variable and set your name as a Troll
        super(name);
    }

    @Override //Overrides so the Troll can have a name
    public String toString(){ //Takes the toString so you can have the ASCII and have your custom name for the Troll
        return "You're a Troll named "+name+"\n"+"/^\\";
    }
    
}
