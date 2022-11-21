package watki;

public class MainWatkiInterrupt {
    public static void main(String[] args) throws InterruptedException {
       // sleep
        Thread watekSleepThread = new Thread(new WatekSleepRunnable());
        watekSleepThread.start();
        watekSleepThread.interrupt();

        // interrupted
        Thread watekInterruptedThred = new Thread(new WatekInterruptedRunnable());
        watekInterruptedThred.start();

        Thread.sleep(1000);

        watekInterruptedThred.interrupt();

        // flaga

        WatekFlagaRunnable watekFlagaRunnable = new WatekFlagaRunnable();
        Thread watekFlagaThread = new Thread(watekFlagaRunnable);
        watekFlagaThread.start();

        Thread.sleep(1000);

        watekFlagaRunnable.zatrzymajWatek();
    }
}
