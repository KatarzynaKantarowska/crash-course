package Operatory;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        // ang. logical operators

        int wiek = 20;

        // koniunkcja (AND)  2 spełnione warunki
        System.out.println( wiek >= 18 && wiek < 30);
        System.out.println( wiek > 30 && wiek < 40);

        // alternatywa (OR) spełniony chociaż jeden warunek
        System.out.println(wiek < 18 || wiek > 65);
        System.out.println( wiek <= 20 || wiek > 65);

        // negacja

        boolean prawda = true;
        System.out.println("!prawda: " + !prawda);

        boolean falsz = false;
        System.out.println("!falsz: " + !falsz);
    }
}
