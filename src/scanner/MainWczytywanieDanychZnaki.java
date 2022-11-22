package scanner;

import java.util.Scanner;

public class MainWczytywanieDanychZnaki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // to działa jako rozdzielenie enterami ! (\n)
        scanner.useDelimiter("\n");

        System.out.println("Podaj coś z klawiatury");
        while (scanner.hasNext()) {
            String next = scanner.next();
            System.out.println("Wczytałam: " + next);
        }
        System.out.println("Koniec działania programu");

        scanner.close();
    }
}
