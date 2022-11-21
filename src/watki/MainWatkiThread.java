package watki;

public class MainWatkiThread {
    public static void main(String[] args) {
        // ang. thread

        MojPierwszyWatek mojPierwszyWatek = new MojPierwszyWatek();
        MojDrugiWatek mojDrugiWatek = new MojDrugiWatek();

        mojPierwszyWatek.start();
        mojDrugiWatek.start();


        }
    }