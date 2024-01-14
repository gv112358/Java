package pkg_es00;

  
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class es00 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nInserisci la dimensione del vettore: ");
        String dim = input.nextLine();

        double[] vettore = new double[Integer.parseInt(dim)];

        int somma = 0;
        double media = 0;
        double varianza = 0;

        for (int i = 0; i < Integer.parseInt(dim); i++) {
            vettore[i] = (Double) (Math.random() * 100 + 99);
            somma += vettore[i];
        }
        media = somma / Integer.parseInt(dim);

        for (int i = 0; i < Integer.parseInt(dim); i++) {
            varianza += Math.pow((vettore[i] - media), 2);
        }
        varianza = varianza / Integer.parseInt(dim);

        System.out.println("Il vettore generato è: " + Arrays.toString(vettore));
        System.out.println("La media è: " + media);
        System.out.println("La varianza è: " + varianza);

    }

}


/* una classe ha un costruttore che riconosco perchè non
 * ritorna nulla, tipo void ecc.., ed ha lo stesso nome della classe
 * 
 * i metodi di classe hanno static davanti, mentre gli altri no e si riferiscono a tutti gli elementi 
 * 
 * per esempio se genero static int[] v = new int[10000000], senza static potrebbe crashare il pc per saturazione di memoria 
 */
