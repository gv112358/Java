public class es05 {
	public static void main(String[] s) {
		// implementare il metodo "Fattoriale" come metodo
		// statico della classe es05
		// definizione: Fattoriale(n) = n * Fattoriale(n-1);
		// Condizione di uscita: Fattoriale(0)=1
		// System.out.println(("Il fattoriale di 10 è: " +
		// Fattoriale(Long.parseLong(s[0]))));

		// Data la stringa s="Nel mezzo del cammin di nostra vita"
		// contare quante vocali ci sono
		// !! L'IDE vi aiuta a cerca il metodo adatto per l'oggetto
		// che state manipolando
		// Ovviamente scriverete un nuovo metodo: GestStringa(s)
		String str = "Nel mezzo del cammin di nostra vita";
		GestStringa(str);

		System.out.println("Vocali: " + ContaVocali(str));

		// l'operatore while è di ciclo
		while (true /* exp logica */) {
			// esempio di ciclo infinito
			break;
		}

		// con il while posso simulare un for
		int idx = 0; // indice
		while (idx < 10) {
			// istruzioni ....

			idx++;
		}
	}

	// Implementazione RICORSIVA
	public static long Fattoriale(long n) {
		if (n == 0) {
			return 1;
		}
		return n * Fattoriale(n - 1);
	}

	// Implementazione ITERATIVA
	public static long FattorialeI(long n) {
		if (n == 0)
			return 0;
		long ret = 1;
		for (long i = 1; i <= n; i++) {
			ret *= i;
		}
		return ret;
	}

	public static int ContaVocali(String str) {
		if (str.length() == 0) {
			return 0;
		}
		if ("aeiouAEIOU".contains(str.substring(0, 1))) {
			return 1 + ContaVocali(str.substring(1));
		} else {
			return ContaVocali(str.substring(1));
		}
	}

	public static void GestStringa(String str) {

		int conta = 0;
		for (char c : str.toCharArray()) {
			if ("aeiouAEUOI".contains(String.valueOf(c))) {
				conta++;
			}
		}
		System.out.println("Vocali: " + conta);
	}

	public static void GestStringaV4(String str) {
		int contaVocali = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					contaVocali++;
			}
		}
		System.out.println("Ho trovato " + contaVocali + " vocali");

		// contaVocali = 0;
		// char[] ca = str.toCharArray();
		// for (int i = 0; i < ca.length; i++) {
		// char c = ca[i];
		// if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		// contaVocali++;
		// }
		// }
		// System.out.println("Ho trovato " + contaVocali + " vocali");

		// for (char x : str.toCharArray()) {
		// // x è un carattere della stringa
		// }
	}

}
