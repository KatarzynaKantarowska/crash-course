package tablice;

public class TabliceJednowymiarowe {
    public static void main(String[] args) {
        //ang. arrays

        int[] tablica;
        tablica = new int[10];
        // tablica[indeks]
        tablica[0] = 5;
        tablica[1] = 10;
        tablica[2] = 15;
        tablica[3] = 155;

        System.out.println(tablica[3]);

        double [] tablicaDouble = new double[5];
        tablicaDouble[0] = 12.5;
        tablicaDouble[1] = 55.5;
        tablicaDouble[2] = 111.11;
        tablicaDouble[3] = 235.1;
        tablicaDouble[4] = 325.5;
        System.out.println(tablicaDouble[0]);

        //System.out.println(tablicaDouble[99]);    program przestał działać od tego momentu, bo wyszliśmy poza rozmiar

        char[] tablicaCharow = new char[100];
        System.out.println(tablicaCharow[0]);

        int [] nowaTablicaIntow = new int[]{10,50,99,101,55};
        //int [] nowaTablicaIntow = {10,50,99,101,55}; szybszy zapis powyższego

        System.out.println(nowaTablicaIntow[0]);
        System.out.println(nowaTablicaIntow[1]);
        System.out.println(nowaTablicaIntow[2]);
        System.out.println(nowaTablicaIntow[3]);
        System.out.println(nowaTablicaIntow[4]);

        System.out.println("tablica rozmiar: " + tablica.length);
        System.out.println("tablicaDouble rozmiar: " + tablicaDouble.length);
        System.out.println("tablicaCharow rozmiar: " + tablicaCharow.length);
        System.out.println("nowaTablicaIntow rozmiar: " + nowaTablicaIntow.length);


    }
}
