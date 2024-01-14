/*Verificare che il numero di parametri passati dall'utente sulla riga
 * di comando sia esattamente 2. se diverso uscire con messaggio di errore
 * se pari a due, convertirli in numeri interi e stampare il prodotto
 */

/*Gli argomenti sono passati dalla riga di comando quando il programma
 * dopo essere stato compilato con javac nome.jave, viene lanciato
 con il comando java nomefile param1 param2
 */
public class es01 {
    public static void main(String[] argomenti) {

        if (argomenti.length != 2) {
            System.out.println("I paramentri devono essere 2");

        } else {

            int n1;
            int n2;
            n1 = Integer.parseInt(argomenti[0]);
            n2 = Integer.parseInt(argomenti[1]);
            System.out.println("il prodotto dei due numeri è: ");
            System.out.println(n1 * n2);
        }
    }
}
