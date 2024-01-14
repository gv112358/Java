import java.util.*;
import java.util.stream.Collectors;

class Nomi implements Comparable<Nomi> {
    String nome;
    String cognome;

    public Nomi(String n, String c) {
        nome = n;
        cognome = c;
    }

    public String toString() {
        return nome + ", " + cognome;
    }

    @Override
    public int compareTo(Nomi o) {
        int cmpnome = nome.compareTo(o.nome);
        int cmpcogn = cognome.compareTo(o.cognome);
        if (cmpcogn != 0) {
            return cmpcogn;
        } else {
            return cmpnome;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> li = new LinkedList<>();
        Random rnd = new Random(0);
        for (int i = 0; i < 10; i++) {
            li.add(rnd.nextInt(100));
        }

        // Stampare la lista li ordinata!!!!
        Collections.sort(li);
        System.out.println(li);

        System.out.println(Collections.max(li));
        System.out.println(Collections.min(li));

        Collections.reverse(li);
        System.out.println(li);

        Collections.rotate(li, 2);
        System.out.println(li);

        List<Nomi> nomi = new ArrayList<>();
        nomi.add(new Nomi("a", "b"));
        nomi.add(new Nomi("e", "c"));
        nomi.add(new Nomi("b", "d"));
        nomi.add(new Nomi("h", "e"));

        // ordinare la lista!!!!
        Collections.sort(nomi);
        System.out.println(nomi);

        /*
         * Data una lista di numeri interi, come fareste in
         * python a mettere tutti i numeri "al quadrato?"
         * ln = [2, 3, 4, 5]
         * print(list(map(lambda x: x*x, ln)))
         */

        System.out.println(li);
        List<Integer> li1 = li.stream().map((Integer v) -> v * v).toList();
        // collect(Collectors.toList());
        System.out.println(li1);

        List<String> ls = new LinkedList<>();
        ls.add("uno");
        ls.add("due");
        ls.add("tre");

        // voglio creare una nuova lista dove le stringhe diventano maiuscole
        List<String> ls1 = ls.stream().map((String s) -> s.toUpperCase()).toList();
        System.out.println(ls1);

        ls1 = ls.stream().map(
                (String s) -> {
                    // quante istruzioni mi servono
                    return s.substring(0, 1).toUpperCase() + s.substring(1);
                }).toList();
        System.out.println(ls1);

        System.out.println(li);
        // Voglio lasciare in li solo i numeri pari!!!!
        List<Integer> lpari = li.stream().filter((Integer n) -> (n % 2) == 0).toList();
        System.out.println(lpari);

        // Voglio calcolare la somma di tutti gli elementi di li
        Integer somma = li.stream().reduce(0, (Integer c, Integer p) -> {
            return c + p;
        });
        System.out.println(somma);
    }
}
