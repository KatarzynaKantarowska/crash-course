package paradygmatyProgramowaniaObiektowego.ZadanieTelewizor;

import paradygmatyProgramowaniaObiektowego.ZadanieTelewizor.Philips.P43PUS6523;
import paradygmatyProgramowaniaObiektowego.ZadanieTelewizor.Philips.P55PUS7334;
import paradygmatyProgramowaniaObiektowego.ZadanieTelewizor.Samsung.UE43RU7172;

import java.util.Scanner;

public class MainPodsumowanie {
    public static void main(String[] args) {

        //private static void obslugaTelewizora () {
        obslugaPilota();

//        Scanner scanner = new Scanner(System.in);
//        Telewizor tv = new P55PUS7334("UniPhikalneid123");
//
//
//        int opcja;
//        System.out.println("1. Włącz; 2. Wyłącz; 3. Zmień program; 4. Zakończ program;");
//        do {
//            opcja = scanner.nextInt();
//
//            switch (opcja) {
//                case 1:
//                    tv.wlacz();
//                    break;
//                case 2:
//                    tv.wylacz();
//                    break;
//                case 3:
//                    System.out.println("Podaj numer programu: ");
//                    int numer = scanner.nextInt();
//                    tv.przelaczProgram(numer);
//                    break;
//            }
//        } while (opcja != 4);
//        scanner.close();
    }

    private static void obslugaPilota() {
        Pilot pilot = new PilotUniwersalny();
        Telewizor telewizor = new P55PUS7334("UNikalneidasda123");
        pilot.sparujTelewizor(telewizor);

        Scanner scanner = new Scanner(System.in);
        int opcja;

        System.out.println("0. Naciśnij czerwony; 1. Naciśnij 1; 2. Naciśnij 2; 3. Naciśnij 3; 4. Zakończ;");
        do {
            opcja = scanner.nextInt();

            switch (opcja) {
                case 0:
                    pilot.nacisnijCzerwony();
                    break;
                case 1:
                    pilot.nacisnijJeden();
                    break;
                case 2:
                    pilot.nacisnijDwa();
                    break;
                case 3:
                    pilot.nacisnijTrzy();
                    break;
            }
        }while (opcja != 4) ;

            scanner.close();
        }
    }

