package zadania_abstrakcja_interfejs.zadanie2;

public class Main {
    public static void main(String[] args) {

        Kolo kolo = new Kolo(4);
        Prostokat prostokat = new Prostokat(4, 6);

        System.out.println("Koło obwód: " + kolo.obwod());
        System.out.println("Koło pole: " + kolo.pole());

        System.out.println("Prostokąt obwód: " + prostokat.obwod());
        System.out.println("Prostokąt pole: " + prostokat.pole());

    }
}
