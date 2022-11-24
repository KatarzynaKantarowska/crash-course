package wczytywanieIZapisywanieDanychZPlikow;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainPlikiWczytywanieInne {
    public static void main(String[] args) {
        //Scanner
        //FileReader
        //InputStreamReader
        try {
            List<String> allLines = Files.readAllLines(Paths.get("przyklad_txt"));
            System.out.println(allLines);
        }catch (IOException e) {
            System.out.println("Coś poszło nie tak");
        }

    }
}
