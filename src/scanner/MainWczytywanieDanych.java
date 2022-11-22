package scanner;
import java.util.Scanner;

public class MainWczytywanieDanych {
    public static void main(String[] args) {

        Scanner scaneer = new Scanner(System.in);
        String linia;


        while (true) {
            linia = scaneer.nextLine();
            System.out.println("Wprowadziłam: " + linia);

            if(linia.equals("KONIEC")) {
                System.out.println("No to kończę działanie");
                break;
    }

}


    do {
        linia = scaneer.nextLine();
        System.out.println("Wprowadziłam w do while " + linia);
    }while(!linia.equals("KONIEC"));
        System.out.println("Zakończyłam działanie");

        while (!(linia = scaneer.nextLine()).equals("KONIEC")) {
            System.out.println("Wprowadziłam w do while innego: " + linia);
        }
        System.out.println("Zakończyłam działanie");
    }
}
