import java.util.Arrays;
import java.util.Scanner;

public class ZmianaNaLiczbeBinarna {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int a = scanner.nextInt();
        System.out.println("Jej wartość binarna to: " + Integer.toBinaryString(a));

        System.out.println("Przechodzimy do zadania z sortowaniem bąbelkowym");

        int[] liczby = {0, 1, 2, 3, 4, 5, 10, 5, 2};

        System.out.println(Arrays.toString(liczby));

        for (int i = 0; i < liczby.length; i++) {
            for (int j = i + 1; j < liczby.length; j++) {

                int liczbaA = liczby[i];
                int liczbaB = liczby[j];

                if (liczbaA > liczbaB) {
                    liczby[i] = liczbaB;
                    liczby[j] = liczbaA;

                    System.out.println(Arrays.toString(liczby));
                }

            }

        }
    }
}
