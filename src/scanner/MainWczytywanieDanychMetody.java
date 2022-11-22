package scanner;

import java.util.Scanner;

public class MainWczytywanieDanychMetody {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz coś z klawiatury: ");

//        while(scanner.hasNextInt()) {
//            int wczytany = scanner.nextInt();
//            System.out.println("Wczytany: " + wczytany);
//        }

//        while(scanner.hasNextLine()){
//            String line = scanner.nextLine();
//            System.out.println("Linia: " + line);
//        }
        String next;
        while(!(next = scanner.next()).equals("X")) {
            System.out.println("Wypisany next: " + next);
        }
        System.out.println("Zakończyłem swoje działanie");
    }
}
