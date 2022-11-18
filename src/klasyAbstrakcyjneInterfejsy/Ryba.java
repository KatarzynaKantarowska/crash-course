package klasyAbstrakcyjneInterfejsy;

public class Ryba implements Zwierze {
    @Override
    public void oddychanie() {
        System.out.println("skrzela");

    }

    @Override
    public void odzywianie() {
        System.out.println("robaczki");

    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("ikra");

    }
}
