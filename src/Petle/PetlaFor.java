package Petle;

import java.sql.SQLOutput;

public class PetlaFor {
    public static void main(String[] args) {
        // ang. loops

        int liczenie;
        for(liczenie = 1; liczenie <= 10; liczenie ++) {
            System.out.println("Tekst " + liczenie);
        } // for(int liczenie = 1; liczenie <= 10; liczenie++) tylko w pętli for wykorzysta inta
        System.out.println("Poza pętlą: " + liczenie);
    }
}
