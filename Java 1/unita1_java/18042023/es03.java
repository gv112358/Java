import java.text.Format;
import java.util.Arrays;

public class es03 {
    public static void main(String[] args) {
        final int[] v = { 1, 6, 2, 8, 3, 9, 0 };
        // costruire un nuovo vettore che contiene i valori al
        // contrario
        int lunghezza = v.length;
        int[] v_new = new int[lunghezza];
        for (int i = 0; i < lunghezza; i++) {
            v_new[i] = v[lunghezza - i - 1];
            // System.out.println(v_new[i]);
            System.out.println(String.format("%d, %d", v[i], v_new[i]));

        }
        System.out.println("Il vettore iniziale è: " + Arrays.toString(v));
        System.out.println("Il nuovo vettore è: " + Arrays.toString(v_new));
        /*
         * // un for che cicla finchè non trovo il numero 4
         * int i = 0;
         * while ( boolean a == true){
         * 
         * int n = (int) (Math.random()*1000);
         * if ( n == 4) { a == false}
         */

    }
}
