public class Prostokat {
    public static void main(String[] args) {

        int dlugosc = 5;
        int szerokosc = 10;

        int pole = dlugosc * szerokosc;
        int obwod = dlugosc + dlugosc + szerokosc + szerokosc;
        int przekatna = (dlugosc * dlugosc) + (szerokosc * szerokosc);

        System.out.println("pole: " + pole);
        System.out.println("obwod: " + obwod);
        System.out.println("przekątna: " + Math.sqrt(przekatna));

    }
}
