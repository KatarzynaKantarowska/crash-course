package zmienne.cz1.czesc2_typy_proste;

public class TypyProsteKonwertowanie {
    public static void main (String[] args) {
        int i = 6;
        double d = 2.2;
        //System.out.println(i / d);

        double d2 = (double) i;  //  w tym miejscu int został skonwertowany do doubla, można konwertować tylko mniejsze na większe

        byte by = 100;
        int i1 = by;

        float f =123.22f;
        d2 = (double) f;

        long zmiennaLong = 123;
        int zmiennaInt = (int) zmiennaLong;
        // jeśli dopisujemy np (int) w nawiasie jest to konwertowanie JAWNE i wtedy jest możlwie (musi być podane na jaki typ)
    // konwertowanie niejawne - kiedy nie musimy wpisywać w nawiasie
        zmiennaLong = zmiennaInt;
        // konwertowanie jawne kiedy musimy wpisywać w nawias (rzutowanie)
        zmiennaInt = (int) zmiennaLong;

        zmiennaLong = 1253;

        byte bajt = 100;
        short shor = 10022;
        int in = 1234234;

        in = bajt;
        in = shor;

        shor = bajt;

        bajt = (byte) in;
        System.out.println("bajt: " + bajt);

        int intObliczenia = 6;
        double doubleObliczenia = 2.2;

        //double wynik = intObliczenia / doubleObliczenia;

        int wynik = intObliczenia / (int) doubleObliczenia;
        System.out.println("Wynik :" + wynik);

        double doublePierwszy = 1.2;
        double doubleDrugi = 12.4;
        double wynikDouble = doubleDrugi / doublePierwszy;
        System.out.println("wynik double: " + wynikDouble);

        int wynikInt = (int) doubleDrugi / (int) doublePierwszy;
        System.out.println("wynik int: " + wynikInt);

        int wynikInt2 = (int) (doubleDrugi / doublePierwszy);
        System.out.println("wynik int2: " + wynikInt2);

        char c = 'a';
        int czyMogeZaczarowacInta = c;
        System.out.println("zaczarowany int: " + czyMogeZaczarowacInta);
        // ASCII codes



    }
}
