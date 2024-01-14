public class prova {

    public static String mese(int mese) {
        String[] mesi = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
        if (mese < 1 || mese > 12) {
            return "";
        } else {
            return mesi[mese-1];
        }
    }

    public static double max(double a, double b, double c) {
        return Math.max(a,Math.max(b, c));
    }

    public static int numberOfDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}