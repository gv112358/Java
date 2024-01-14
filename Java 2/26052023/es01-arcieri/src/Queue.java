import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
	private List<T> coda = null;

	public Queue() {
		coda = new LinkedList<>();
	}

	public void enqueue(T item) {
		// => inserisce in coda un elemento
		coda.add(item);
	}

	public T dequeue() {
		// => torna il primo elemento della coda e lo toglie dalla coda
		var s = coda.get(0);
		coda.remove(0);
		return s;
	}

	public boolean empty() {
		// => true se la coda è vuota
		return coda.isEmpty();
	}

	public int size() {
		// => torna quanti elementi ci sono in coda
		return coda.size();
	}

	public void clear() {
		// => cancella tutti gli elementi presenti in coda
		coda.clear();
	}

	public T top() {
		// => torna il primo elemento della coda senza toglierlo dalla coda
		return coda.get(0);
	}

	public void Stampa(/* F */) {
		for (T x : coda) {
			System.out.println(x.toString());
			// x.Print();
			// Se avessi la possibilità di fare
			// F(x); dove F() è un metodo/funzione fornita dal programma chiamante (che
			// quindi conosce come sono
			// fatti gli elementi della lista)
		}
	}
	/*
	 * Una tecnica generale potrebbe essere quella di avere un metodo Stampa/Print
	 * come metodo
	 * dell'oggetto che aggiungo in coda, In tal modo nel ciclo for (T x....)
	 * utilizzerei
	 * x.Print()
	 */

}
