package wyjątki;

import java.io.FileNotFoundException;

public class MainWyjątkiPrzenoszenie {
    public static void main(String[] args) {

        WyjatekPrzenoszenie wyjatekPrzenoszenie = new WyjatekPrzenoszenie();
        try {
            wyjatekPrzenoszenie.wyjatkowaMetoda();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
