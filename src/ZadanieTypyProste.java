import java.util.Scanner;

public class ZadanieTypyProste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo");
        String slowo = scanner.next();
        System.out.println("Słowo składa się z : " + slowo.length() + " znaków");
        System.out.println(new StringBuilder(slowo).reverse());
        System.out.print("Czy jest palinromem ? ");
        System.out.println(new StringBuilder(slowo).reverse().toString().equals(slowo));
    }
}
