import java.util.Arrays;
import java.util.Scanner;

public class ZadaniaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dlugoscTablicy;
        System.out.println("Podaj liczbę całkowitą:");
        //int f =scanner.nextInt();
        //System.out.println("Twoja liczba w systemie binarnym to: " + Integer.toBinaryString(f));

        dlugoscTablicy = scanner.nextInt();
        int[] a = new int[dlugoscTablicy];
        System.out.println("Wprowadź " + dlugoscTablicy + " Elementów do tablicy:\n");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Elementy w tablicy to:\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int k = 0; k < a.length; k++) {
            for (int j = k + 1; j < a.length; j++) {

                int liczbaA = a[k];
                int liczbaB = a[j];

                if (liczbaA > liczbaB) {
                    a[k] = liczbaB;
                    a[j] = liczbaA;

                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }
}
