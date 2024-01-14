public class es03 {
	public static void main(String[] args) {
		// dati i seguenti due vettori
		int[] v1 = { 3, 2, 7, 5, 9, 1, 3, 4, 90, 87 };
		int[] v2a = { 31, 12, 47, 25, 9, 11, 1, 4, 88, 32 };

		// for (int i = 0; i < 100; i++) {
		// System.out.println(i);
		// }

		// contare quante volte il corrispondente numero
		// del secondo vettore è maggiore di quello del primo
		// 31 > 3: conta 1
		// 12 > 2: conta 2
		// ...
		// e stampare il risultato

		// ordino in modo crescente il secondo vettore
		// alloco un vettore alle dimensioni passate al programma come parametro
		int[] v2 = new int[Integer.parseInt(args[0])];
		for (int i = 0; i < v2.length; i++) {
			v2[i] = (int) (Math.random() * 1000000);
		}

		// ora v2 è pieno di dati
		int len = v2.length;
		while (len > 1) {
			int indicemin = iMin(v2, len);
			int old = v2[indicemin];
			v2[indicemin] = v2[len - 1];
			v2[len - 1] = old;
			len--;
		}
		// il vettore è ordinato
		// for (int x : v2) {
		// System.out.print(x + " ");
		// }
		System.out.println("Ordinato!!!");
	}

	public static int iMin(int[] v, int len) {
		int indice_valore_minimo = 0;
		for (int i = 1; i < len; i++) {
			if (v[i] < v[indice_valore_minimo]) {
				indice_valore_minimo = i;
			}
		}
		// ora indice_valore_minimo mi dice a che post sta il più
		// piccolo elemento del vettore
		return indice_valore_minimo;
	}
}