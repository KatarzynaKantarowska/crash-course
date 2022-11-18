package klasyAbstrakcyjneInterfejsy;

public class Ptaki implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("płuca");

    }

    @Override
    public void odzywianie() {
        System.out.println("robaczki");

    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("jajka");

    }
}
