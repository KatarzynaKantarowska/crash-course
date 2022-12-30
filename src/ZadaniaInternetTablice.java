import java.util.Scanner;

public class ZadaniaInternetTablice {
    public static void main(String[] args) {
        String[] alfabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","v","u","w","x","y","z"};

        for (int i = 0; i < 5 ; i++) {
            System.out.println(alfabet[i]);
        }



        int[] liczby = {0, 1, 2, 3, 4, 5, 10};

        for (int i = liczby.length -1; i < liczby.length && i >= 0 ; i--) {
            System.out.println(liczby[i]);
        }
        for (int i = 0; i <= 100 ; i++) {
            System.out.println(i);

        }
        int i=0;
        while (i<100) {
            i++;
            System.out.println(i);
        }
        
        int licz = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();
        String b = String.valueOf(a);
        for (int k = b.length()-1; k < b.length() && k >=0 ; k--) {
            System.out.println(b.charAt(k));

        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String slowo = scanner1.next();
        for (int j = slowo.length()-1; j < slowo.length() && j >=0 ; j--)
            System.out.println(slowo.charAt(j));

        String napis = "kajak";
        System.out.println(new StringBuilder(napis).reverse().toString().equals(napis));

    }
}
