package wyjątki;

public class LiczbaUjemnaException extends RuntimeException{

    public LiczbaUjemnaException(){
        super("Liczba nie może być ujemna");
    }
}
