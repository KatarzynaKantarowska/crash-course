package wczytywanieIZapisywanieDanychZPlikow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainPlikiZapisywanie {
    public static void main(String[] args) {
        try {
            String path = "moj_plik.txt";
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("jakiś ciąg znaków");
            bufferedWriter.newLine();
            bufferedWriter.write("kolejne teksty\n");
            bufferedWriter.write("jeszcze cosik");
            bufferedWriter.newLine();

            bufferedWriter.close();

        }catch (IOException e) {
            System.out.println("Błąd na operacjach z plikiem");
        }
    }
}
