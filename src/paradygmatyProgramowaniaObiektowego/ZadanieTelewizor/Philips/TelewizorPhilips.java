package paradygmatyProgramowaniaObiektowego.ZadanieTelewizor.Philips;

import paradygmatyProgramowaniaObiektowego.ZadanieTelewizor.Telewizor;

import java.util.NoSuchElementException;

public abstract class TelewizorPhilips implements Telewizor {

    private String id;

    protected boolean statusWlaczony = false;

    private int obecnyProgram = 3;

    private int cale;

    protected TelewizorPhilips (String id, int cale) {
        this.id = id;
        this.cale = cale;
    }

    public String getId() {
        return id;
    }

    public int getCale() {
        return cale;
    }

    @Override
    public void wlacz() {
        statusWlaczony = true;
        emitujSygnalNaEkran();
        System.out.println("Witaj!");

    }

    @Override
    public void wylacz() {
        statusWlaczony = false;
        System.out.println("CZERŃ");

    }

    @Override
    public void akcjaZasilania() {
        if (statusWlaczony) {
            wylacz();
        } else {
            wlacz();
        }
    }

    @Override
    public void przelaczProgram(int numer) {
        if (statusWlaczony) {
            obecnyProgram = numer;
        }
    }

    private void emitujSygnalNaEkran() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony) {
                    System.out.println("Program: " + obecnyProgram);
                    try {
                        Thread.sleep(3000);
                    } catch (NoSuchElementException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
