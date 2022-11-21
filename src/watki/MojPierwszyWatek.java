package watki;

public class MojPierwszyWatek extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Mój pierwszy wątek:" + i);
        }
    }
}
