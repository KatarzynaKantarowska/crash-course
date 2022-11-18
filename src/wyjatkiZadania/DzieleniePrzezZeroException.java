package wyjatkiZadania;

public class DzieleniePrzezZeroException extends Exception{

    public DzieleniePrzezZeroException (){
        super("Nie wolno dzielić przez 0!");
    }
}
