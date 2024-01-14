import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class es01 {
    static public void main(String[] args) throws Exception { /* throws IOException */
        /*
         * Leggere una sequenza di numeri, uno per riga, dal terminale
         * e, quando sarà digitata una riga vuota, stampare la somma dei numeri letti
         * #sommare tra loro i numeri presenti nel file numeri.txt
         */

        // devo calcolare la somma dei numeri digitati
        int somma = 0;
        // Creo l'oggetto che consente di leggere da terminale!!!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String riga = br.readLine();
            if (riga == null || riga.length() == 0) {
                System.out.println(somma);
                break;
            } else {
                somma += Integer.parseInt(riga.trim());
            }

        }
    }
    // BufferedReader br = new BufferedReader(
    // new InputStreamReader(System.in));

    // try{
    // br.readLine();
    // } catch (Exception ex) {
    // System.out.println("Error: " + ex.toString());
    // }

    // if (somma<0) {
    // throw new Exception("Sei andato in errore");
    // }

    // }

}
