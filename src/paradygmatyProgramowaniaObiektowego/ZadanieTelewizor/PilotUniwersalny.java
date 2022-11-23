package paradygmatyProgramowaniaObiektowego.ZadanieTelewizor;

public class PilotUniwersalny implements Pilot{

    private Telewizor telewizor;

    @Override
    public void nacisnijCzerwony() {
        telewizor.akcjaZasilania();
    }

    @Override
    public void nacisnijJeden() {
        telewizor.przelaczProgram(1);
    }

    @Override
    public void nacisnijDwa() {
        telewizor.przelaczProgram(2);
    }

    @Override
    public void nacisnijTrzy() {
        telewizor.przelaczProgram(3);
    }

    @Override
    public void sparujTelewizor(Telewizor telewizor) {
        this.telewizor = telewizor;

    }
}
