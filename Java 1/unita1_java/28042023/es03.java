
//import java.util.regex.*;
import java.util.Arrays;

public class es03 {
    static public void main(String[] args) {
        /*
         * date due stringhe lette da terminale, s1 e s2, di cui
         * s1 più lunga di s2:
         * 1) stampare la lunghezza di ogni stringa
         * 2) stampare se s1 contiene la stringa s2
         * 3) cercare e stampare tutti i numeri interi presenti nella
         * stringa s1; da fare alla fine
         * 4) convertire la stringa s1 in un vettore (v1) di stringhe, una parola per
         * elemento del vettore (vi ricordate lo split di python?)
         * 5) ordinare il vettore v1 in ordine crescente
         * 6) contare quante sequenze di parole uguali (una immediatamente dopo l'altra)
         * ci sono in v1
         * Esempio:
         * s1="al 12 men 45 tra due 55 al 10 al uno al due al uno"
         * s2="tra due 55"
         */

        // 1) Lunghezza delle stringhe
        String s1 = "al 12 men 45 tra due 55 al 10 al uno al due al uno";
        String s2 = "tra due 55";
        System.out.println("Lunghezza s1: " + s1.length()); // Lunghezza di s1
        System.out.println("Lunghezza s2: " + s2.length()); // Lunghezza di s2

        // 2) Stampare se s1 contiene s2
        boolean ret = s1.contains(s2);
        // Alternativo: ret = s1.indexOf(s2);
        if (ret == true) {
            System.out.println("La stringa s1 contiene la stringa s2 ");
        }

        // 4) Convertire la stringa s1 in un vettore v1
        String[] v1 = s1.split(" ");
        System.out.println("v1: " + Arrays.toString(v1));

        // 5) Ordinare il vettore v1 in ordine crescente
        Arrays.sort(v1); // ordina il vettore, sort() non restituisce nulla in output
        System.out.println("v1 ordinato: " + Arrays.toString(v1));

        // 3) Cercare e stampare gli interi in s1
        String stringa = "";
        for (char c : s1.toCharArray())
            if (c < '0' || c > '9') // Esclude tutti i caratteri che contengono interi
                stringa += c;
        System.out.println("s1 senza gli interi: " + stringa); // stringa = s1 senza gli interi
        String[] Astringa = stringa.split(" "); // creo l'array da stringa
        System.out.println("Il nuovo array è: " + Arrays.toString(Astringa));
        Arrays.sort(Astringa); // ordina il nuovo array;
        System.out.println("Nuovo array ordinato: " + Arrays.toString(Astringa));
        for (int i = 0; i < v1.length; i++) {
            if (Astringa[i].isBlank()) // Scorro gli elementi nel nuovo array
                System.out.println(v1[i]); // se trovo uno spazio come carattere
                                           // stampo il carattere di v1 in quella posizione
        }

        // 6) Conta le sequenze di parole uguali e le stampa come report
        int conta = 1;
        for (int i = 1; i < v1.length; i++) {
            if (v1[i].equals(v1[i - 1])) {
                conta++;
            } else {
                System.out.println(v1[i - 1] + ": " + conta);
                conta = 1;
            }

        }
        System.out.println(v1[v1.length - 1] + ": " + conta);
    }

}
