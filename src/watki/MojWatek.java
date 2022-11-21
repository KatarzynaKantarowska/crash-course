package watki;

public class MojWatek implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Jestem w moim wątku :" + i);
        }

    }
}
