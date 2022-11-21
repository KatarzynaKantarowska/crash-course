package watki;

public class MainWatkiPodwojnyStart {
    public static void main(String[] args) {

        MojeRunnable mojeRunnable = new MojeRunnable();
        Thread thread = new Thread(new MojeRunnable());
        thread.start();

        // kiedyś za jakiś czas...

        Thread thread2 = new Thread(new MojeRunnable());
        thread2.start();
    }
}
