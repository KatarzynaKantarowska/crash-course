package watki;

public class WatekInterruptedRunnable implements Runnable {
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Wątek Interrupted Runnable działa");
            }
        System.out.println("Poza whilem i koniec");
        }
    }
