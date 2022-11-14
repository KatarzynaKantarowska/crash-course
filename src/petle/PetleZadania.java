package petle;

public class PetleZadania {
    public static void main(String[] args) {
        // 1. Wypisz na ekran liczby od 0 do 30 a następnie od 30 do 0;
        System.out.println("Zadanie 1");
        int j = 30;
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (j = 30; j >= 0 ; j--) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
        // 2. Napisz program, który wypisze tylko liczby parzyste z zakresu od 0 do 30.
        System.out.println("Zadanie 2 ");
        for (int i  = 0; i <= 30 ; i += 2) {
            System.out.print(i + " ");
            
        }
        System.out.println(" ");
        // 3. Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b (a < b). Wypisz na ekran zakres liczb od a do b.
        System.out.println("Zadanie 3");
        int a = 5;
        int b = 10;
        for (int k = a; k <= b; k++) {
            System.out.print(k + " ");
        }

        /* 4. Utwórz tablicę rozmiaru  10 elementów i uzupełnij liczbami. Wypisz wszystkie liczby z tablicy na ekran.
        Następnie wypisz te liczby od tyłu.
         */
        System.out.println(" ");
        System.out.println("Zadanie 4 ");
        int[] tab = { 5, 45, 43, 78, 50, 42, 46, 85, 12, 45};
        //for (int i = 0; i < tab.length; i++)
        for (int i = 0; i <= tab.length -1; i++) {
            System.out.print(tab[i] + " ");
            
        }
        System.out.println();
        for (int i = tab.length -1; i >=0 ; i--) {
            System.out.print(tab[i] + " ");

        }
        System.out.println();
        // 5. Wykorzystując tablicę z poprzedniego zadania, oblicz sumę jej elementów.
        System.out.println("Zadanie 5");
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            wynik = tab[i] + wynik;

        }
        System.out.println("Wynik: " + wynik);

       // 6. Napisz program, który będzie oblicza silnię z nieujemnej liczby.
        System.out.println("Zadanie 6");
        // 5! = 5 * 4 * 3 * 2 * 1 = 120

        int liczba = 5;
        int wynikSilnia = 1;

        for (int i = liczba; i >=1 ; i--) {
            wynikSilnia = wynikSilnia * i;

        }
        System.out.println("Wynik silnia: " + wynikSilnia);
        //7. Napisz program, w który po podaniu liczby n narysujesz za pomocą * trójkąt prostokątny o przyprostokątnych składających się z n-razy *
        System.out.println("Zadanie 7");

        int n = 5;
        int liczbaGwiazdek = 1;

        for (int i = 1; i <= n ; i++) {
            for (int l = 1; l <= liczbaGwiazdek; l++) {
                System.out.print("*");

            }
            System.out.println();
            liczbaGwiazdek++;

        }
        // 8. Narysuj odbicie lustrzane trójkątów z poprzedniego zadania 
        System.out.println("Zadanie 8");
        int liczbaGwiazdekLustrzanych = 1;
        int liczbaSpacjiLustrzanych = n-1;

        for (int i = 1; i <= n ; i++) {
            for (int m = 1; m <= liczbaSpacjiLustrzanych; m++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= liczbaGwiazdekLustrzanych ; m++) {
                System.out.print("*");
                
            }
            System.out.println();
            liczbaSpacjiLustrzanych--;
            liczbaGwiazdekLustrzanych++;
        }


    }
};