package klasy.zadanie3;

public class ZadaniaKlasyMainKolejny {
    public static void main(String[] args) {

        System.out.println("Obwod koła " + Matma.obwodKola(4));
        System.out.println("Pole koła: " + Matma.obwodKola(4));
        System.out.println("Obwód prostokąta: " + Matma.obwodProstokata(4,6));
        System.out.println("Pole prostokąta: " + Matma.poleProstokata(4,6));
        int[] tab = {1, 5, 9};
        System.out.println("średnia: " + Matma.srednia(tab));

    }
}
