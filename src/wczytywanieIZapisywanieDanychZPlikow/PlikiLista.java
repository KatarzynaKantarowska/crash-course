package wczytywanieIZapisywanieDanychZPlikow;

import java.util.ArrayList;
import java.util.List;

public class PlikiLista {
    public static void main(String[] args) {
        int[] tablica = new int [10];
        // int -> Integer
        // boolean -> Boolean
        // char -> Character
        // float -> Float
        // double -> Double

        List<Integer> mojaLista = new ArrayList<>();
        mojaLista.add(10);
        mojaLista.add(5);
        mojaLista.add(-101);
        mojaLista.add(5045);
        mojaLista.add(54565);

        mojaLista.remove(2);

        for (int i = 0; i < mojaLista.size() ; i++) {
            System.out.println(mojaLista.get(i));
        }
        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("Jakieś");
        listaStringow.add("teksty");
    }
}
