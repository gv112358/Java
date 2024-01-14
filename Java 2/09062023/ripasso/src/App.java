import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Automobile implements Comparable<Automobile> {
    String modello;
    String costruttore;
    int cilindrata;

    public Automobile(String m, String c, int ci) {
        modello = m;
        costruttore = c;
        cilindrata = ci;
    }

    public String toString() {
        return String.format("Modello: %s, Costruttore: %s, Cilindrata: %d", modello, costruttore, cilindrata);
    }

    @Override
    public int compareTo(Automobile o) {
        return cilindrata - o.cilindrata;
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

        System.out.println(lauto);

        Collections.sort(lauto);
        System.out.println(lauto);

        // 1) ??? Modificare la classe in modo da consentirne la stampa
        // tramite System.out.println

        // 2) ??? Ordinare la lista per cilindrata e stamparla dalla
        // cilindrata più piccola alla cilindrata più grande
    }
}
