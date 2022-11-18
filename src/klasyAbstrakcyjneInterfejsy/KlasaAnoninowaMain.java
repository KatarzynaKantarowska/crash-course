package klasyAbstrakcyjneInterfejsy;

public class KlasaAnoninowaMain {
    public static void main(String[] args) {
        // ang. anonymous class

        ZwyklaKlasa obiektklasyAnonimowej = new ZwyklaKlasa() {
            @Override
            public void metodaZwykla() {
                System.out.println("Metoda wywolana z klasy anoninowej");
            }
        };

        obiektklasyAnonimowej.metodaZwykla();

        ZwyklaKlasa zwyklaKlasa = new ZwyklaKlasa();
        metodaTutaj(new ZwyklaKlasa(){

            public void metodaZwykla () {
                System.out.println("Specjalnie dla Was zmienione zachowanie");
            }
        });
    }

    public static void metodaTutaj(ZwyklaKlasa parametr) {
        parametr.metodaZwykla();

        }
    }
