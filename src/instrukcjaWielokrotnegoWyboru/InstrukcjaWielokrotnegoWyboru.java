package instrukcjaWielokrotnegoWyboru;

public class InstrukcjaWielokrotnegoWyboru {
    public static void main(String[] args) {
        // switch

        int zmienna = 5;
        switch (zmienna) {
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            case 5:
                System.out.println("Pięć");
                break;
            default:
                System.out.println("Nie spełniono żadnego przypadku powyższego");
                break;
        }
        char pojedynczyZnak = 'a';
        switch (pojedynczyZnak) {
            case 'a':
                System.out.println("Podałeś małe a");
                break;
            case 'A':
                System.out.println("Podałeś duże A");
                break;
            default:
                System.out.println("Nie znam tego znaku");
                break;
        }
        System.out.println("będzie wykonywany if");

        if (zmienna == 1) {
            if (zmienna ==2) {
                System.out.println("dwa");
            } else if (zmienna == 3) {
                System.out.println("trzy");
            } else if (zmienna == 5) {
                System.out.println("pięć");
            }else {
                System.out.println("nie znam tej liczby");
            }
        } else {
            System.out.println("jeden");
        }
        System.out.println("Kalendarz:");
        int miesiąc = 5;
        switch (miesiąc) {
            case 1:
                System.out.println("Styczeń");
            case 2:
                System.out.println("Luty");
            case 3:
                System.out.println("Marzec");
            case 4:
                System.out.println("Kwiecień");
            case 5:
                System.out.println("Maj");
            case 6:
                System.out.println("Czerwiec");
            case 7:
                System.out.println("Lipiec");
            case 8:
                System.out.println("Sierpień");
            case 9:
                System.out.println("Wrzesień");
            case 10:
                System.out.println("Październik");
            case 11:
                System.out.println("Listopad");
            case 12:
                System.out.println("Grudzień");


        }
    }
}
