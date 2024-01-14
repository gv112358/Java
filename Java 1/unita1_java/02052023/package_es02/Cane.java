package package_es02;

public class Cane extends Animale {
    static final String verso = "Bauuu!";
    String colore;

    public Cane(String nome, int eta, String colore) {
        super(nome, eta, verso);
        this.colore = colore;

    }

}
