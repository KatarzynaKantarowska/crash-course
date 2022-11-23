package paradygmatyProgramowaniaObiektowego;

public class Kon extends Ssak{

    public Kon(String nazwa) {
        super(nazwa);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("ihaaaaa");

    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem konik, lubię biegać po polanie a nazywam się " + nazwa);

    }
}
