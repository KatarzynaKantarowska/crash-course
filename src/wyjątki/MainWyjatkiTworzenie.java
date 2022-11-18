package wyjątki;

public class MainWyjatkiTworzenie {
    public static void main(String[] args) {
        Uzytkownik uzytkownik = new Uzytkownik();

        try {
            uzytkownik.wprowadzEmail("jan.kowalski@przyklad.com");
            uzytkownik.wprowadzHaslo("qwerty123tajne");
            System.out.println("Wszystko poszło ok");
        } catch (NiezbytTajneHasloException e) {
            e.printStackTrace();
            System.out.println("Hasło niezbyt bezpieczne..");
        } catch (NiepoprawnyEmailException e) {
            System.out.println("Email nie zawiera @");
        }
        System.out.println("Czy doszedłem tutaj?");
    }
}
