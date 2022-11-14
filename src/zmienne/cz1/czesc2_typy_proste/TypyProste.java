package zmienne.cz1.czesc2_typy_proste;

public class TypyProste {
    public static void main(String[] args) {
        // ang. primitive types

        // info: 1 bajt = 8 bitów

        // Liczby całkowite
        byte zmiennaByte = 10;
        System.out.println("Byte:" + zmiennaByte);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short zmiennaShort = 200;
        System.out.println("Short: " + zmiennaShort);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);


        int zmiennaInt = 1000000;
        System.out.println("Int: " + zmiennaInt);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE );

        long zmiennaLong = 100000000L;
        System.out.println("long: " + zmiennaLong);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        // Liczby ziennoprzecinkowe
        float zmiennaFloat = 12.34F;
        System.out.println("Float: " + zmiennaFloat);

        double zmiennaDouble = 12.34;
        System.out.println("Double: " + zmiennaDouble);

        // Pojedyncze znaki
        char zmiennaChar = 'a';
        System.out.println("Char:" + " " + zmiennaChar);

        // Wartości logiczne
        boolean zmiennaBoolean = true;
        System.out.println("Boolean: " + zmiennaBoolean);


    }

}
