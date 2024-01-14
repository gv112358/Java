package package_es02;

public class es02 {
    public static void main(String[] args) {
        // System.out.println(Cane.verso);
        // System.out.println(Cane.makeSound());
        System.out.println(" \n ...............qui c'è qualche animale.............. \n");
        Cane cane = new Cane("Rex", 5, "nero");
        cane.verso();

        Gatto gatto = new Gatto("Silvestro", 6);
        gatto.verso();
        System.out.println("il colore del cane è: " + cane.colore);
        System.out.println("l'eta del gatto è: " + gatto.eta);

        gatto.stampaDati();
        cane.stampaDati();

    }

}
