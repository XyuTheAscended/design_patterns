package strategy;
//Extending the Knight to Character since Character is the parent class.
public class Knight extends Character{
    public Knight(String name){ // Allows you to take name variable and set your name as a Knight
        super(name);
    }

    
    @Override //Overrides so the Knight can have a name
    public String toString(){ //Takes the toString so you can have the ASCII and have your custom name for the Knight
        return "You're a Knight called "+name+"\n"+"(--)";
    }
    
}
