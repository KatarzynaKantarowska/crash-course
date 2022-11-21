package watki.watkiZadania;

public class ZadaniaWatki {
    public static void main(String[] args) {

        Runnable runnableAnonimowe = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Ta informacja została wypisana z klasy anonimowej i z mojego wątku");
            }
        };
        Thread threadZRunnableAnonimowym = new Thread(runnableAnonimowe);
        threadZRunnableAnonimowym.start();


        Thread czasoodmierzaczThread = new Thread(new Czasoodmierzacz());
        czasoodmierzaczThread.start();


        Scigacz scigaczPierwszyRunnale = new Scigacz("Ścigacz nr1");
        Scigacz scigaczDrugiRunnale = new Scigacz("Ścigacz nr2 ");
        Thread scigaczPierwszyThread = new Thread((scigaczPierwszyRunnale));
        Thread scigaczDrugiThread = new Thread((scigaczDrugiRunnale));

        scigaczPierwszyThread.start();
        scigaczDrugiThread.start();

    }
}
