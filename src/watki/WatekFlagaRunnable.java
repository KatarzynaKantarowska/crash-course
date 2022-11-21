package watki;

public class WatekFlagaRunnable implements Runnable{

    private boolean watekDziala;

    @Override
    public void run() {
        watekDziala = true;
        while (watekDziala) {
            System.out.println("Wątek flaga działa");
        }
        System.out.println("Wątek flaga zakończył działanie");
    }
    public  void zatrzymajWatek () {
        watekDziala = false;

    }
}
