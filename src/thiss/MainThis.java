package thiss;

public class MainThis {
    public static void main(String[] args) {
        KlasaRozszerzonaThis obiekt1 = new KlasaRozszerzonaThis();
        System.out.println("ODDZIELENIE");
        KlasaRozszerzonaThis obiektw = new KlasaRozszerzonaThis(111);
        System.out.println("ODDZIELENIE");
        KlasaRozszerzonaThis obiekt3 = new KlasaRozszerzonaThis(1,2);

        System.out.println(obiekt3.x);
        System.out.println(obiekt3.y);

        obiekt3.metodaZParametrami(4567892);
        System.out.println("pole: " + obiekt3.pole);

    }
}
