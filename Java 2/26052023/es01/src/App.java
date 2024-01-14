import java.util.Scanner;

public class App {

    enum Comandi {

        e_Inserisci_elemento_in_coda,
        e_Visualizza_il_primo_elemento_della_coda_rimuovendolo,
        e_Verifica_se_la_coda_e_vuota,
        e_Visualizza_numero_elementi,
        e_Cancella_tuti_gli_elemetni,
        e_Visualizza_il_primo_elemento_della_coda,
        e_Stampa_contenuto_della_coda,
        e_Esci 
    };

    /*
         
Utilizzando una LinkedList o arraylist, costruire una classe Queue (coda) che
ha i seguenti metodi
1) costruttore
2) enqueue(item) => inserisce in coda un elemento
3) dequeue() => torna il primo elemento della coda e lo toglie dalla coda
4) empty() => true se la coda è vuota
5) size() => torna quanti elementi ci sono in coda
6) clear() => cancella tutti gli elementi presenti in coda
7) top() => torna il primo elemento della coda senza toglierlo dalla coda
8) print() => stampa il contenuto della coda
Il tipo di dato da mettere in coda sono stringhe (es: id di persone per
gestire una coda alla posta)
Nel main dovete
1) creare la coda di stringhe
2) inserire in coda un numero qualsiasi di persone
3) verificare se la coda è vuota
4) verificare quanti elementi sono presenti in coda
5) stampare il primo elemento della coda (senza toglierlo dalla coda)
6) togliere alcuni elementi dalla coda
7) stampare l'intera coda
8) cancellare la coda
9) verificare quanti elementi sono presenti in coda
Per i più rapidi
1) modificare la coda in una coda di tipi <generics>
2) provarla con elementi della classe Persona (presa da un precedente
esercizio)
*/
    public static void main(String[] args) throws Exception {
        
        Queue<String> coda = new Queue<>();

        Scanner input = new Scanner(System.in);

        CMenu<Comandi> menu = new CMenu<>(Comandi.values());
        boolean running = true;
        while (running) {
            Comandi cmd = menu.run();
            System.out.println("Comando: " + cmd);
            switch (cmd) {
                case e_Inserisci_elemento_in_coda:
                    System.out.println("Inserisci l'elemento da aggiungere in coda: ");
                    String item = input.nextLine();
                    coda.enqueue(item);
                    System.out.println("Elemento aggiunto in coda: " + item);

                    break;
                case e_Visualizza_il_primo_elemento_della_coda_rimuovendolo:
                    if (coda.isEmpty()) {
                        System.out.println("La coda è vuota.");
                    } else {
                        String PrimoElemento = coda.dequeue();
                        System.out.println("Primo elemento della coda rimosso: " + PrimoElemento);
                    }
                    break;
                case e_Verifica_se_la_coda_e_vuota:
                    System.out.println("La coda è vuota: " + coda.isEmpty());
                    break;
                case e_Visualizza_numero_elementi:
                    System.out.println("Numero di elementi nella coda: " + coda.size());
                    break;
                case e_Cancella_tuti_gli_elemetni:
                    coda.clear();
                    System.out.println("Coda svuotata.");
                    break;
                case e_Visualizza_il_primo_elemento_della_coda:
                    if (coda.isEmpty()) {
                        System.out.println("La coda è vuota.");
                    } else {
                        System.out.println("Primo elemento della coda: " + coda.top());
                    }
                    break;
                case e_Stampa_contenuto_della_coda:
                    coda.printQueue();
                    break;
                case e_Esci:
                    running = false;
                    break;
                
            }
        }
        
    }
}
