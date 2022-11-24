package enumNauka;

public class MainTypWyliczeniowyEnum {
    public static void main(String[] args) {
        KierunekSwiata kierunek = KierunekSwiata.POLNOC;
        System.out.println(kierunek);
        
        if (kierunek == KierunekSwiata.POLNOC) {
            System.out.println("Poszedł na północ");
        } else if (kierunek == KierunekSwiata.POLUDNIE) {
            System.out.println("Poszedł na południe");
        } else if (kierunek == KierunekSwiata.WSCHOD) {
            System.out.println("Poszedł na wschód");
        } else if (kierunek == KierunekSwiata.ZACHOD) {
            System.out.println("Poszedł na zachód");
        } else {
            System.out.println("Coś poszło nie tak. Wybrałeś złą drogę");
        }

        System.out.println("Teraz switch");

        switch (kierunek) {
            case POLNOC:
                System.out.println("Poszedł na północ");
                break;
            case POLUDNIE:
                System.out.println("Poszedł na południe");
                break;
            case WSCHOD:
                System.out.println("Poszedł na wschód");
                break;
            case ZACHOD:
                System.out.println("Poszedł na zachód");
                break;
            default:
                System.out.println("Coś poszło nie tak. Wybrałeś złą drogę");
                break;


        }

        // ordinal(), valueOf(), values()
        KierunekSwiata kierunekSwiata = KierunekSwiata.WSCHOD;
        System.out.println("ordinal(): " + kierunekSwiata.ordinal());

        KierunekSwiata kolejnyKierunekSwiata = KierunekSwiata.valueOf("WSCHOD");
        System.out.println("valueOf(): " + kolejnyKierunekSwiata);

        KierunekSwiata[] kierunkiSwiata = KierunekSwiata.values();
        for (int i = 0; i < kierunkiSwiata.length ; i++) {
            System.out.println("i: " + i + ", kierunek: " + kierunkiSwiata[i]);
        }

        KierunekSwiata ks = KierunekSwiata.values()[2];
        System.out.println("values()[2]: " + ks);
    }
}
