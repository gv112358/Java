import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Automobile {
    String modello;
    String costruttore;
    int cilindrata;

    public Automobile(String m, String c, int ci) {
        modello = m;
        costruttore = c;
        cilindrata = ci;
    }

    @Override
    public String toString() {
        return "Automobile [modello=" + modello + ", costruttore=" + costruttore + ", cilindrata=" + cilindrata + "]";
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        List<Automobile> lauto = new LinkedList<>();

        Automobile a1 = new Automobile("panda", "fiat", 900);
        lauto.add(a1);
        a1 = new Automobile("Enzo", "Ferrari", 3000);
        lauto.add(a1);
        a1 = new Automobile("Miura", "Lamborghini", 3500);
        lauto.add(a1);
        a1 = new Automobile("a1", "Citroen", 650);
        lauto.add(a1);

        System.out.println("Lista non ordinata:");
        System.out.println(lauto);

        // Ordina la lista per cilindrata
        Collections.sort(lauto, new Comparator<Automobile>() {
            @Override
            public int compare(Automobile a1, Automobile a2) {
                return Integer.compare(a1.cilindrata, a2.cilindrata);
            }
        });

        System.out.println("Lista ordinata per cilindrata:");
        System.out.println(lauto);
    }
}
