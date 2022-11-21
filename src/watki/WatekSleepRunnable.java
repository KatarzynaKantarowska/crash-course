package watki;

public class WatekSleepRunnable implements Runnable{
    @Override
    public void run() {
        try {
        while (true) {
            System.out.println("Wątek sleep");
            Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Poszedł exception w sleep ()");
            return;
        }
    }
}
