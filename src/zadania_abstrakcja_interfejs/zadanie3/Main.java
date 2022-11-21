package zadania_abstrakcja_interfejs.zadanie3;

public class Main {
    public static void main(String[] args) {

        Info infoAnonimowe = new Info() {
            @Override
            public void wyswietlInfo() {
                System.out.println("informacja wypisana z klasy anonimowej");
            }
        };
        infoAnonimowe.wyswietlInfo();

    }

    interface Info {
        void wyswietlInfo();
    }
}
