package wyjatki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class WyjatekPrzenoszenie {

    public void wyjatkowaMetoda() throws FileNotFoundException {
        File file = new File("plik.txt");
        InputStream inputStream = new FileInputStream(file);
    }
}
