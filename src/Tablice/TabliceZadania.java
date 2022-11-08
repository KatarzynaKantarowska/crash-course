package Tablice;

public class TabliceZadania {
    public static void main(String[] args) {

        int [] tablica1 = new int[5]; // int [] tablica1 = {5, 15, 25, 35, 45};
        tablica1 [0] = 5;
        tablica1 [1] = 15;
        tablica1 [2] = 25;
        tablica1 [3] = 35;
        tablica1 [4] = 45;

        int suma = tablica1[0] + tablica1 [1] + tablica1 [2] + tablica1[3] + tablica1[4];

        System.out.println("Suma elementów z tablicy1: " + (tablica1[0] + tablica1 [1] + tablica1 [2] + tablica1[3] + tablica1[4]) );
        System.out.println("Suma elementów z tablicy1: " + suma);

        double [][] tablica2 = new double[3][5];
        tablica2 [0][0] = 1.1;
        tablica2 [0][1] = 2;
        tablica2 [0][2] = 3;
        tablica2 [0][3] = 5;
        tablica2 [0][4] = 2;

        tablica2 [1][0] = 4.;
        tablica2 [1][1] = 5;
        tablica2 [1][1] = 6;
        tablica2 [1][3] = 7;
        tablica2 [1][4] = 8.9;

        tablica2 [2][0] = 9;
        tablica2 [2][1] = 4;
        tablica2 [2][2] = 8.2;
        tablica2 [2][3] = 6;
        tablica2 [2][4] = 3;


        double a = tablica2[0][0] + tablica2[0][1] + tablica2[0][2] + tablica2[0][3] + tablica2[0][4];
        double b = tablica2[1][0] + tablica2[1][1] + tablica2[1][2] + tablica2[1][3] + tablica2[1][4];
        double c = tablica2[2][0] + tablica2[2][1] + tablica2[2][2] + tablica2[2][3] + tablica2[2][4];

        System.out.println("suma wiersza o indeksie0: " + a );
        System.out.println("suma wiersza o indeksie1: " + b );
        System.out.println("suma wiersza o indeksie2: " + c );


    }
}
