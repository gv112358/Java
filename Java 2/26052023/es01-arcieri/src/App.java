public class App {

    public static void main(String[] args) throws Exception {
        /*
         * Utilizzando una LinkedList, costruire una classe Queue (coda) che
         * ha i seguenti metodi
         * 1) costruttore
         * 2) enqueue(item) => inserisce in coda un elemento
         * 3) dequeue() => torna il primo elemento della coda e lo toglie dalla coda
         * 4) empty() => true se la coda è vuota
         * 5) size() => torna quanti elementi ci sono in coda
         * 6) clear() => cancella tutti gli elementi presenti in coda
         * 7) top() => torna il primo elemento della coda senza toglierlo dalla coda
         * 8) Stampa() => stampa il contenuto della coda
         * 
         * Il tipo di dato da mettere in coda sono stringhe (es: id di persone per
         * gestire una coda alla posta)
         * 
         * Nel main dovete
         * 1) creare la coda di stringhe
         * 2) inserire in coda un numero qualsiasi di persone
         * 3) verificare se la coda è vuota
         * 4) verificare quanti elementi sono presenti in coda
         * 5) stampare il primo elemento della coda (senza toglierlo dalla coda)
         * 6) togliere alcuni elementi dalla coda
         * 7) stampare l'intera coda
         * 8) cancellare la coda
         * 9) verificare quanti elementi sono presenti in coda
         * 
         * Per i più rapidi
         * 1) modificare la coda in una coda di tipi <generics>
         * 2) provarla con elementi della classe Persona (presa da un precedente
         * esercizio)
         */
        Queue<String> coda = new Queue<>();
        coda.enqueue("uno");
        coda.enqueue("due");
        coda.enqueue("quattro");
        coda.enqueue("tre");
        coda.enqueue("uno");
        coda.enqueue("tre");

        coda.Stampa();

        Queue<Persona> cp = new Queue<>();
        cp.enqueue(new Persona("a", "b"));
        cp.enqueue(new Persona("c", "d"));
        cp.enqueue(new Persona("e", "f"));
        cp.Stampa();

        // ...

        // Test t = new Test();
        // t.executeMethod(App::thecall);
    }

    // public static void thecall(String s) {
    // System.out.println("Message: " + s);
    // }

    // li=[1,2,3,4,5]
    // l2 = [x*x for x in li]
}
