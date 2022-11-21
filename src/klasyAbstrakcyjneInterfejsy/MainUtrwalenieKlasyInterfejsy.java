package klasyAbstrakcyjneInterfejsy;

public class MainUtrwalenieKlasyInterfejsy {
    public static void main(String[] args) {
     KlasaUtrwalenie obiektKlasa =  new KlasaUtrwalenie() {
            @Override
            public void metodaKlasaUtrwalenie(String anonimowa_metoda_klasa) {
                System.out.println("Anonimowa klasa: metoda");
            }

            @Override
            public int metodaInterfejsu() {
                System.out.println("Anonimowa klasa: metodaInterfejsu");
                return 0;
            }
        };

     KlasaAbstrakcyjnaUtrwalenie klasaAbstrakcyjnaUtrwalenie = new KlasaAbstrakcyjnaUtrwalenie() {

         @Override
         public void metodaAbstrakcyjna() {
             System.out.println("Druga klasa anonimowa: metodaAbstrakcyjna");

         }
       };

        DrugiInterfejsUtrwalenie drugiInterfejsUtrwalenie = new DrugiInterfejsUtrwalenie() {

            @Override
            public int metodaZDrugiegoInterfejsu() {
                return 1234567;
            }

            @Override
            public String kolejnaMetodaZInterfejsuDrugiego() {
                return "coś z drugiego interfejsu";
            }

            @Override
            public int metodaInterfejsu() {
                return 1234;
            }
        };
    }
}
