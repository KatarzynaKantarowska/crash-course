package petle;

public class PetleBreakContinue {
    public static void main(String[] args) {
        int zmienna;
        for (zmienna = 1; zmienna <= 20; zmienna++) {
            System.out.println("Przed continue: " + zmienna);
            if (zmienna == 18) {
                continue;
            }
            System.out.println("Zmienna: " + zmienna);

        }

        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna == 18) {
                break;
            }
            System.out.println("Zmienna w drugiej pętli: " + zmienna);
        }
        for (zmienna = 1; ; zmienna++) {
            if (zmienna ==100) {
                break;
            }
            System.out.println("Trzeci for: " + zmienna);
        }
    }
}
