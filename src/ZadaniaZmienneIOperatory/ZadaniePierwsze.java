package ZadaniaZmienneIOperatory;

public class ZadaniePierwsze {
    public static void main(String[]args ){

        int wiek = 28;
        double wzrost = 1.68;
        double waga = 63.5;

        System.out.println("wiek: " + wiek);
        System.out.println("wzrost: " + wzrost);
        System.out.println( "waga: " + waga);

        System.out.println("BMI: " + waga / (wzrost * wzrost) );
        System.out.println("BMI: " + waga /  Math.pow(wzrost, 2));

        int wynikBMI = (int)(waga / (wzrost * wzrost));
        int wynikBMI1 = (int)waga / (int)(wzrost * wzrost);
        int wynikBMI2 = (int)waga / ((int)wzrost * (int)wzrost);

        System.out.println("wynik Mateusza: " + wynikBMI2);

        System.out.println("int waga:" + waga);
        System.out.println("int wzrost: " + wzrost * wzrost);
        System.out.println("Po zmianie na inta wynik to: " + (int) wynikBMI);

        int dowolny = 5;
        int a = 2;
        int b = 3;
        int c = 11;

        System.out.println("dzielenie: " + dowolny / a);
        System.out.println("dzielenie: " + dowolny / b);
        System.out.println("dzielenie: " + dowolny / c);
        System.out.println("reszta z dzielenia: " + dowolny % a);
        System.out.println("reszta z dzielenia: " + dowolny % b);
        System.out.println("reszta z dzielenia: " + dowolny % c);

        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);

        int przekraczajacy = (int) 12345678055L;


        System.out.println("wynik przekraczający: "+ przekraczajacy);





    }
}
