package klasy.zadanie2;

public class ZadaniaKlasy {
    public static void main(String[] args) {


        int[] tablica = {5, 15, 45, 25, 55};
        TablicaObliczenia tablicaObliczenia = new TablicaObliczenia(tablica);

        System.out.println("suma: " + tablicaObliczenia.suma());
        System.out.println("średnia:" + tablicaObliczenia.srednia());
        System.out.println("min:" + tablicaObliczenia.min());
        System.out.println("max:" + tablicaObliczenia.max());

    }
}
