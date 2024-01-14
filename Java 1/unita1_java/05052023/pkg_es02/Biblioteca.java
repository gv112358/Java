package pkg_es02;

public class Biblioteca {
    static Libro[] libri;
    int pos; // conta il numero di libri dell'archivio come posizione dell'array

    public Biblioteca(int dim) {
        libri = new Libro[dim]; // creo un array di dim oggetti libri
        pos = 0;
    }

    public void aggiungiLibro(Libro libro) {
        libri[pos++] = libro;

    }

    public void stampaLibri() {
        for (int i = 0; i < pos; i++) {
            System.out.println("\n Il titolo del libro è " + libri[i].titolo);
        }
    }

}
