package tablice;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        int [][] tablicaDwuwymiarowa = new int[10][10];
        tablicaDwuwymiarowa[0][1] = 123;
        tablicaDwuwymiarowa[4][8] = 190;

        System.out.println(tablicaDwuwymiarowa[4][8]);

        int [][] nowaTablica = {
                {1, 2, 3, 11, 12, 13},
                {4, 5, 6, 41, 42, 43}
        };
        System.out.println("[0][0]:"+ nowaTablica[0][0]);
        System.out.println("[0][1]:"+ nowaTablica[0][1]);
        System.out.println("[1][2]:"+ nowaTablica[1][2]);
        System.out.println("[1][5]:"+ nowaTablica[1][5]);

        System.out.println("Rozmiar całej tablicy: " + nowaTablica.length);
        System.out.println("Rozmiar kolumny 0: " + nowaTablica[0].length);
        System.out.println("Rozmiar kolumny 1: " + nowaTablica[1].length);

        System.out.println("Rozmiar całej tablicy tablicaDwuwymiarowa: " + tablicaDwuwymiarowa.length);
        System.out.println("Rozmiar kolumny 0: " + tablicaDwuwymiarowa[0].length);
        System.out.println("Rozmiar kolumny 1: " + tablicaDwuwymiarowa[1].length);
        System.out.println("Rozmiar kolumny 2: " + tablicaDwuwymiarowa[2].length);
        System.out.println("Rozmiar kolumny 9: " + tablicaDwuwymiarowa[9].length);

        int [][][] tablicaTrojwymiarowa = new int[5][6][11];



    }
}
