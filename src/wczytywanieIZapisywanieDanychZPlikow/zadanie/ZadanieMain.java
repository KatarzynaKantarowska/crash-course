package wczytywanieIZapisywanieDanychZPlikow.zadanie;

import java.io.*;
import java.util.Scanner;

public class ZadanieMain {
    public static void main(String[] args) {

        try {
            File file = new File("fragment.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String sciezka = "fragment-kopia.txt";
            FileWriter fileWriter = new FileWriter(sciezka);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj szukaną frazę");
            String szukanaFraza = scanner.nextLine();

            String linia;
            int liczbaZnakow = 0;
            boolean czyZawieraFraze = false;
            int numerLinii = 0;

            while((linia = bufferedReader.readLine()) != null) {
                numerLinii++;
                //a) wypisz zawartość na ekran
                //System.out.println(linia);

                //b) zlicz i wypisz ilość znaków występujących w pliku
                liczbaZnakow += linia.length();

               // c)wczytaj tekst z klawiatury i sprawdź czy znajduje się dana fraza pliku
                if(linia.toLowerCase().contains((szukanaFraza))) {
                czyZawieraFraze = true;
                }

                //d) znajdz wiele fraz w pliku i wypisz, w której linii się znajduje

                if(linia.toLowerCase().contains(szukanaFraza)) {
                    System.out.println(numerLinii + ": " + linia);
                }
                //e) przekopiuj całą zawartość do nowego pliku o nazwie fragment-kopia.txt
                bufferedWriter.write(linia + "\n");
            }
            System.out.println();
            System.out.println("Liczba znaków: " + liczbaZnakow);
            System.out.println("Czy zawiera frazę: " + czyZawieraFraze);

            bufferedWriter.write("\nKopia pliku utworzona przez Katarzynę Kantarowską");

            bufferedWriter.close();
            bufferedReader.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
        } catch (IOException e) {
            System.out.println("Nie udało się wczytać danych");
        }
    }
}
