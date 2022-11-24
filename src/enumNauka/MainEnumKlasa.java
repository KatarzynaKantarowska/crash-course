package enumNauka;

public class MainEnumKlasa {
    public static void main(String[] args) {
        Pizza pizza = Pizza.XXL;
        System.out.println("Zamówiłeś pizzę: " + pizza + " " + pizza.pobierzRozmiar());
        System.out.println("Koszt: " + pizza.pobierzCene());

        Pizza pizza2 = Pizza.DUZA;
        System.out.println("Zamówiłeś pizzę2: " + pizza2 + " " + pizza2.pobierzRozmiar());
        System.out.println("Koszt2: " + pizza2.pobierzCene());

        float kosztCaly = pizza.pobierzCene() + pizza2.pobierzCene();
        System.out.println("Do zapłaty: " + kosztCaly);

    }
}
