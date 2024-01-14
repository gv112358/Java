package pkg_es02;
/*
     * Creare una classe Libro, una classe Autore, una classe Biblioteca
     * dove
     * Libro
     * - titolo (string)
     * - autore (della classe Autore)
     * - scaffale (int)
     * Autore
     * - Nome
     * - Nazionalità
     * Biblioteca
     * - contiene max 1000 libri
     * - AddLibro(Libro)
     * - PrintLibri() => stampa tutti i libri con i nomi dei rispettivi autori
     */
public class es01 {
    public static void main(String[] args) {
        
    Biblioteca archivio = new Biblioteca(10);
    Autore a1 = new Autore("Goethe", "Germania");
    Autore a2 = new Autore("Hemingway", "USA");

    Libro l1 = new Libro("i dolori del giovane Werther", 1, a1);
    archivio.aggiungiLibro(l1);
    Libro l2 = new Libro("Fiesta", 0, a2);
    archivio.aggiungiLibro(l2);
    archivio.stampaLibri();


    }
    
}
