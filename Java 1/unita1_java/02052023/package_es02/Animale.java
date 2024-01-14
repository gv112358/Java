package package_es02;

import javax.sound.sampled.AudioFileFormat.Type;

public class Animale {
    String nome;
    int eta;
    String suono;

    // Costruttore
    public Animale(String nome, int eta, String suono) {
        this.nome = nome; // si può scrivere anche nome = _nome
        this.eta = eta;
        this.suono = suono;
    }

    public void verso() {
        System.out.println(suono);
    }

    public void stampaDati() {
        System.out.println(this.nome + " è un " + this.getClass().getSimpleName() + " di anni " + this.eta);
    }
}
