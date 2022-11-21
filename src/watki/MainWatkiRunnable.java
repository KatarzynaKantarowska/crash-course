package watki;

public class MainWatkiRunnable {
    public static void main(String[] args) {

        Thread thread = new Thread( new MojWatek());
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Jestem z klasy anonimowej dla wątków:" + i);
                }
            }
        });

        thread2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Bez przypisania do zmiennej :" + i);
                }
            }
        }).start();

    }
}
