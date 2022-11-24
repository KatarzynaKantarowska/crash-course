package wczytywanieIZapisywanieDanychZPlikow;

import java.io.*;

public class MainPlikiWczytywanie {
    public static void main(String[] args) {
//        try {
//            File file = new File("plik.txt");
//            Scanner scanner = new Scanner(file);
//
//            while (scanner.hasNextLine()){
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//            scanner.close();
//
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Nie znaleziono pliku!");
//        }
//        System.out.println("Koniec działania programu");


        try {

            // C: \\Users\\kasia\\plik_na_komputerze.txt

            File file = new File ("plik.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e ) {
            System.out.println("Brak pliku!");
        } catch (IOException e) {
            System.out.println("Problem z wczytywaniem pliku");
        }
    }
}
