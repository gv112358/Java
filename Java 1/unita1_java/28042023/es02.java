import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class es02 {
    /*
     * Dato il file holmes.txt
     * 1) Stampare quante parole ci sono
     * NB: una parola è separata dall'altra da uno " "
     */
    static public void main(String[] args) throws IOException {
        int righe = 0;
        int numParole = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String riga = br.readLine();
            if (riga == null) {
                break;
            }
            righe++;
            String[] rigasplit = riga.split(" ");
            numParole = numParole + rigasplit.length;
        }
        System.out.println(righe);
        System.out.println(numParole);
    }

}
