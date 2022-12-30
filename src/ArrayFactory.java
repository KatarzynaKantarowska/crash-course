import java.util.Scanner;

public class ArrayFactory {
    public static void main(String[] args) {

        int len;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        len = scanner.nextInt();
        int[] a = new int[len];
        System.out.println("Wprowadź " + len + " Elementów do tablicy:\n");
        for (int i = 0; i < len; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Elementy w tablicy to:\n");
        for (int i = 0; i < len; i++) {
            System.out.println(a[i] + " ");
        }
        int[][] tablicaDwuwymiarowa = new int[len][len];
        System.out.println("Wprowadź " + len + " wierszy i kolumn:\n");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    tablicaDwuwymiarowa[i][j] = 1;
                } else {
                    tablicaDwuwymiarowa[i][j] = scanner.nextInt();
                }
            }
        }
        System.out.println("Liczba wierszy i kolumn to:\n");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(tablicaDwuwymiarowa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
