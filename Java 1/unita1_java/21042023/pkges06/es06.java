/*
 * Creare una classe Persona che contiente le variabili 
 * di istanza: eta,nome, altezza
 * Creare due persone diverse
 * archiviarle in un array
 * (necessario creare una cartella pkg perchè le 
 * classi si vedano tra loro)
 */

package pkges06;

public class es06 {
    public static void main(String[] a) {
        Persona per1 = new Persona(15, "Bruno", 150);
        Persona per2 = new Persona(55, "Marika", 180);

        Persona[] persone = new Persona[2];

        persone[0] = per1;
        persone[1] = per2;
    }
}
