// Creare un'enumerazione Java chiamata "Mese" che contenga i nomi di tutti i dodici mesi dell'anno. Quindi, scrivere un programma che chieda all'utente di inserire un numero di mese (da 1 a 12) e visualizzi il nome del mese corrispondente.

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