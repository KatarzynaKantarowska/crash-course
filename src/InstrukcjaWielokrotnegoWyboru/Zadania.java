package InstrukcjaWielokrotnegoWyboru;

public class Zadania {
    public static void main(String[] args) {

        double a = 5;
        if (a % 2 == 0) {
            System.out.println("Liczba jest parzysta");
            } else {
            System.out.println("Liczba jest nieparzysta");
        }

        double dochod = 1000;

        if (dochod < 0) {
            System.out.println("Nic nie musisz płacić");
        } else if (dochod <= 85528){
            double podatek = dochod * 0.17;
            System.out.println("Podatek będzie wynosił: " + podatek);
        } else {
            double podatekPonizejProgu = 85528 * 0.17;
            double podatekPowyzejProgu = (dochod - 85528) * 0.32;
            double podatek = podatekPonizejProgu + podatekPowyzejProgu;
            System.out.println("Podatek już większy do zapłaty wynosi: " + podatek);
        }


        System.out.println("Kalkulator");
        double liczba1 = 10;
        double liczba2 = 5;
        char znak ='+';
        double wynik = 0;


        switch (znak) {
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
                wynik = liczba1 - liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            case '/':
                wynik = liczba1 / liczba2;
                break;
            default:
                System.out.println("Podałeś nieprawidłowy znak, zatem nie jestem w stanie obliczyć!");

        }
        System.out.println(liczba1 + " " + znak + " " + liczba2 + " = " + wynik);


    }
}
