package Petle;

public class PetlaWPetli {
    public static void main(String[] args) {
        int licznik = 0;
        int[][] tablica = new int [5][10];
        for(int i = 0; i <5; i++) {
            for (int j = 0; j < 10; j++) {
                licznik++;
               tablica[i][j] = licznik;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

    }
}
