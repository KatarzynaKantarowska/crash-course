package paradygmatyProgramowaniaObiektowego;

public class Pies extends Ssak {


    public Pies(String nazwa) {
        super(nazwa);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("hał hał");

    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem pieskiem i nazywam się: " + nazwa);

    }
}
