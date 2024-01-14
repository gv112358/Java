public class es04 {
    public static void main(String[] args) {
        /*
         * Stampare i numeri da 1 a 100 con
         * intervallo 7 e da 100 a 1 con passo
         * 7 e i multipli di 13
         */
        for (int i = 1; i <= 100; i += 7) {
            System.out.println(String.format("%d, %d", i, 100 - i));

            for (int j = 13; j <= 200; j++) {
                if (j % 13 == 0) {
                    System.out.println(j);
                }

            }
        }

    }
}
