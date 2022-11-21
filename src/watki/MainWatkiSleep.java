package watki;

public class MainWatkiSleep {
    public static void main(String[] args) {
        System.out.println("Gotowi?");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("START!");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Wątek1 :" + i);
                    try {Thread.sleep(1000);} catch (InterruptedException e) { }
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Wątek2: " + i);
                    try {Thread.sleep(500);} catch (InterruptedException e) { }
                }
            }
        });
        thread2.start();
    }
}
