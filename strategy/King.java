package strategy;
//Extending the King to Character since Character is the parent class.
public class King extends Character {

    public King(String name){// Allows you to take the name variable and set your name as a King.
      super(name);
    }

    @Override //Overrides so the King can have a name
    public String toString(){//Takes the toString so you can have the ASCII and have your custom name for the King
        return "You're a King called "+ name + "\n" + " __/^^^\\\\__";
    }
    
}
