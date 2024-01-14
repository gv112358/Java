/*differenza tra
coda: 1st in 1st out
pila: last in 1st out
lista(struttura dati navigata in un verso, sequenziale, flessibile
in python sembra che la lista sia ad acecsso diretto ma non lo è
è inefficiente perchè la devo scandire tutta
attraverso tutti i punti intermedi) 

Vettore : simile alla RAM, lo alloco ad un pezzo di ram,
ci arrivo con un ciclo di clock, è la struttura
più rapida, ha tempo di accesso unitario*/
public class es01 {
    public static void main(String[] arg) {
        int somma = 0;
        float media = 0;
        int[] vettore = new int[10]; // new calcola quanta memoria è richiesta e se la va ad allocare
        for (int i = 0; i < 10000000; i++) {
            vettore[i] = (int) (Math.random() * 1000);
            somma += vettore[i];
        }
        media = somma / 10000000;
        // System.out.println("La media dei 10 numeri è:");
        // System.out.println(media);
        /*
         * System.out.println(0b10010110); // binario
         * System.out.println(0xf34512); // esadecimale
         * System.out.println(123L); //long
         * System.out.println(123D); //double
         * System.out.println();
         * 
         */
    }
}