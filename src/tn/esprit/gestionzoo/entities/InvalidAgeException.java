package tn.esprit.gestionzoo.entities;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(){
        super("L'âge de l'animal ne peut pas être négatif.");
    }
    public InvalidAgeException (String msg){
        super(msg);
    }
}
