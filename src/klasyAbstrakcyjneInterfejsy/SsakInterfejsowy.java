package klasyAbstrakcyjneInterfejsy;

public class SsakInterfejsowy implements Zwierze {
    @Override
    public void oddychanie() {
        System.out.println("płuca");

    }

    @Override
    public void odzywianie() {
        System.out.println("rośliny lub mięsko");

    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("żyworodne");

    }
}
