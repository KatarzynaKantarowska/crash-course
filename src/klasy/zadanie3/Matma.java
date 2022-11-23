package klasy.zadanie3;

import wyjatki.LiczbaUjemnaException;

public class Matma {

    public static final double PI = 3.14;



    public static double obwodKola(double r) {
        if (r < 0){
            throw new LiczbaUjemnaException();
        }
        double wynik = 0;
        wynik = 2 * PI * r;
        return wynik;
    }

    public static double poleKola (double r) {
        return PI * r * r;
    }

    public static double obwodProstokata (double a, double b) {
        return  2 * (a +b);
    }

    public static double poleProstokata (double a, double b) {
        return a*b;
    }
    public static int suma(int[] tablica){
        int suma = 0;
        for (int i = 0; i < tablica.length ; i++) {
            suma += tablica[i];

        }
        return suma;
    }
    public static int srednia(int[] tablica) {
        int srednia = suma(tablica) / tablica.length;
        return srednia;
    }

    public static int min (int[] tablica) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tablica.length ; i++) {
            if (tablica[i] < min) {
                min = tablica [i];
            }

        }
        return min;
    }
    public static int max (int[] tablica){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tablica.length ; i++) {
            if (tablica[i] > max) {
                max = tablica [i];
            }

        }
        return max;
    }

}
