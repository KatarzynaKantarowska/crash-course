package Petle;

public class PetlaWhile {
    public static void main(String[] args) {
        int liczenie = 1;
        while (liczenie <= 10) {
            System.out.println("Tekst " + liczenie);
            liczenie++;
        }
        liczenie = 1;
        do {
            System.out.println("Tekst z do while: " + liczenie);
            liczenie++;
        } while(liczenie <= 10);
    }
}
