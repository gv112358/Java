public class main {
public static void main(String[] args) {
    Rettangolo r1 = new Rettangolo(1, 3, 4, 5);
    Rettangolo r2 = new Rettangolo(2, 7, 2, 4);

    System.out.println("Rettangolo1 di altezza: " + r1.altezza + " e base: " + r1.base);
    System.out.println("Il perimetro di r1: " + r1.perimetro());
    System.out.println("L'area di r1: " + r1.area());
    System.out.println("Il rettangolo r1 è un quadrato? " + r1.quadrato());

    r1.ruotasx();
    System.out.println(" Ruotando r1 a sinistra di 90° : nuova base: " + r1.base + " nuova altezza: " + r1.altezza);


    System.out.println("I rettangoli si intersecano? " + r1.intersezione(r2));
    System.out.println("Il più piccolo rettangolo che contiene r1 è: " + r1.contiene(r1));
}
}