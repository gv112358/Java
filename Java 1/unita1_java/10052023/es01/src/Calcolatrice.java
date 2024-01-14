import java.util.Scanner;

public class Calcolatrice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Scegli quanti numeri inserire in input: ");
        int n = input.nextInt();

        System.out.println("Scegli l'operazione da effetture: ");
        System.out.println("1 -> somma di tutti i numeri");
        System.out.println("2 -> somma dei soli numeri pari");
        System.out.println("3 -> prodotto di tutti i numeri");
        System.out.print("Operazione scelta: ");
        int opzione = input.nextInt();

        int[] numeri = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il " + (i+1) + "° numero: ");
            numeri[i] = input.nextInt();
        }

        int risultato = 0;
        if (opzione == 1) {
            for (int i = 0; i < n; i++) {
                risultato += numeri[i];
            }
        } else if (opzione == 2) {
            for (int i = 0; i < n; i++) {
                if (numeri[i] % 2 == 0) {
                    risultato += numeri[i];
                }
            }
        } else if (opzione == 3) {
            risultato = 1;
            for (int i = 0; i < n; i++) {
                risultato *= numeri[i];
            }
        } else {
            System.out.println("Operazione non valida!");
            return;
        }

        System.out.println("Il risultato dell'operazione richiesta è: " + risultato);
    }

}