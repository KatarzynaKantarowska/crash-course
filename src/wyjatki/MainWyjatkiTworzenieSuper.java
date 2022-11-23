package wyjatki;

public class MainWyjatkiTworzenieSuper {
    public static void main(String[] args) {
        try {
            wyrzucKoniecznieJakisWyjatek();
        } catch (JakisException e) {
            System.out.println("Obsługuję odpowiednio wyjątek w catch," +
                    " a wiadomość wyjątku to: " + e.getMessage()
                    );
        }

    }
    public static void wyrzucKoniecznieJakisWyjatek() throws JakisException {
        throw new JakisException("Specjalna wiadomość ");
    }
}
