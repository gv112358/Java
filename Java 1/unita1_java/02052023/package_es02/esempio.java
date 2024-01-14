package package_es02;

public class esempio {
    Animale an1 = new Gatto("pippo", 10);
        if (an1 instanceof Cane) {
            System.out.println("Cane");
            an1.verso();
        } else {
            System.out.println("Gatto");
            an1.verso();
        }
}


// dato che java è fortemente tipizzato, non posso comporre array eterogenei
// tranne che se gli elementi appartengono tutti a una stessa classe madre