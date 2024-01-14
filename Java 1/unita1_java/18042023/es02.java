/*Costruire un array di interi casuali, di dimensioni 100, e trovare 
 * il numero più grande presente nell'array
 */
//import java.util.Random;
public class es02 {
    // questa istruzione genera numero random intero tra 0 e 1000
    // int n = (int) (Math.random()*1000);
    public static void main(String[] arg) {
        int[] vettore = new int[100];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 100; i++) {
            vettore[i] = (int) (Math.random() * 1000);
            if (vettore[i] > max) {
                max = vettore[i];
            }
            System.out.println(vettore[i]);

        }
        System.out.println("Il valore massimo è: ");
        System.out.println(max);
        int min = Integer.MIN_VALUE;
        System.out.println(min);
    }
}

/*
 * una lista python non è un oggetto a accesso diretto,
 * deve leggerla dall'inizio
 * In java l'array invece accede direttamente all'allocazione di
 * memoria dell'elemento dell'array che mi serve. A discapito
 * della rigidità, lunghezza predefinita e dati dello stesso tipo
 * quando creiamo un nuovo array, visto che java funziona a classi,
 * lo definisco con new: "int[] v = new int[1000]"
 */