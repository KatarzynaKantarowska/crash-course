package enumNauka;

public enum Pizza {
    MALA(20, 9.90f),
    DUZA(34, 16.50f),
    FAMILIJNA(42, 21f),
    XXL(50, 29.90f);

    private int rozmiar;
    private float cena;

   private Pizza (int rozmiar, float cena) {
       this.rozmiar = rozmiar;
       this.cena = cena;
    }
    public int pobierzRozmiar() {
        return this.rozmiar;
    }

    public  float pobierzCene() {
       return this.cena;
    }
}
