/* 
        //vado a introdurre una enumerazione, elenco ordinato di simboli
        // xxd è un programma che visualizza i caratteri e codifica ascii
    final static int LUNEDI = 0;
    final static int MARTEDI = 1;
    final static int MERCOLEDI = 2;
    final static int GIOVEDI = 3;
    final static int VENERDI = 4;
    final static int SABATO = 5;
    final static int DOMENICA = 6;
        //si potrebbe fare così, e in C è così..
        */

// Creare un'enumerazione Java chiamata "Mese" che contenga i nomi di tutti i dodici mesi dell'anno. 
//Quindi, scrivere un programma che chieda all'utente di inserire un numero di mese (da 1 a 12) e visualizzi il nome del mese corrispondente.

import java.util.Scanner;

public class es01 {
    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int monthNum = input.nextInt();
        Month month = Month.values()[monthNum - 1];
        System.out.println("You entered: " + month);
    }
}
