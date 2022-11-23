package paradygmatyProgramowaniaObiektowego.ZadanieTelewizor.Philips;

import java.util.NoSuchElementException;

public abstract class TelewizorPhilipsAmbilight extends TelewizorPhilips {

    protected TelewizorPhilipsAmbilight(String id, int cale) {
        super(id, cale);
    }

    @Override
    public void wlacz() {
        super.wlacz();
        ambilight();
    }

    @Override
    public void wylacz() {
        super.wylacz();
    }
    private void ambilight () {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony) {
                    try{
                        System.out.println("Wyświetlaj kolorki z tyłu");
                        Thread.sleep(1000);
                    } catch (NoSuchElementException |InterruptedException e) {
                        e.printStackTrace();
                        }
                    }
                }
        }).start();
    }
}
