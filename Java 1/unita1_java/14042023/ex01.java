public class ex01 {
    public static void main(String[] args) {
        int num = 10000000;
        System.out.println("Hello World");
        System.out.println(num * num);

        int pippo = 10;

        System.out.println(pippo++);
        System.out.println(pippo++);

        int pluto = 100;
        System.out.println(++pluto);
        System.out.println(++pluto);

        byte b = 1;
        System.out.println(b << 1);
        System.out.println(b << 5);
        System.out.println(b >> 5);

        b >>= 5; // identico a b = b >> 5;
        System.out.println(b);

        System.out.println(35 >> 2);
        System.out.println(35 << 6);

        System.out.println(16 >>> 1); // shift unsigned

        int i = 10;
        System.out.println((float) i); // casting delle variabili

        if (i > 10) {
            // questo è il then
            // ...
        } else {
            // questo è then
        }
        // il for
        for (int j = 0; j < 100; j++) {
            // sequenza operazioni
        }
        /*
         * complemento bit a bit:
         * b=00010010 in binario (18 deimale)
         * ~b=11101101
         */

        /*
         * In aritmetica binaria b=00000001
         * lo shift <<1 sposta tutti i bit di un posto verso sinistra
         * b=00000010
         */

    }
    /*
     * multiline
     * comment
     * public class ex01 ha classe pubblica perchè deve essere eseguito
     * dal compilatore java, e il nome della classe deve essere uguale
     * a quello del file.
     * 
     * main è un metodo della classe ex01 e void indica che non ritorna
     * niente
     * 
     * main (String [] args) indica che il metodo main prende come argomento un
     * array di stringa (si legge da Destra, LR)
     * 
     * per lanciarlo prima va compilato con comando da terminale:
     * javac nomefile.java -> crea il bytecode per la macchina virtuale di java
     * ovvero nomefile.class
     * e poi si lancia con
     * java nomefile.java
     * 
     * Java è fortemente tipizzato.Numeri: byte short int long; float(32 bit)
     * double(64 bit)
     */

    // single line comment
}