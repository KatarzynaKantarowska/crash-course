package klasyAbstrakcyjneInterfejsy;

public abstract class Ssak {

    public void karmieniePotomstwa() {
        System.out.println("Karmię mlekiem");
    }
    public void temperaturaCiala(){
        System.out.println("Moja temperatura jest stała");
    }
    public void podajIloscKonczyn(){
        System.out.println("Mam 4 kończyny");
    }
    public abstract void wydajDzwiek();

    public abstract void przemieszczanieSie();
}
