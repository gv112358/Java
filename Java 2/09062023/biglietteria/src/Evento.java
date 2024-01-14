import java.text.Format;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

class Prenotazione {
	public String nome;
	public int id;

	public Prenotazione(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public String toString() {
		return String.format("Nome: %s, Id: %d", nome, id);
	}
}

public class Evento {
	String descrizione;
	String luogo;
	String data;
	int numeroUnico;

	List<Prenotazione> prenotazioni;

	public String toString() {
		return String.format("Descrizione: %s, Luogo: %s, Data: %s \n\t%s\n",
					descrizione,luogo,data,prenotazioni.toString());
	}

	public Evento(String descrizione, String luogo, String dataevento) {
		this.descrizione = descrizione;
		this.luogo = luogo;
		this.data = dataevento;
		prenotazioni = new LinkedList<>();
		numeroUnico = 0;
	}

	// torna l'id (intero) delle prenotazione
	public int Prenota(String nome) {
		int id = numeroUnico;
		numeroUnico = numeroUnico + 1;

		Prenotazione p = new Prenotazione(nome, id);

		prenotazioni.add(p);
		return id;
	}

	public void EliminaPrenotazione(int idPrenotazione) {
        // devo cercare nella lista delle prenotazioni
        // l'oggetto che contiene id pari a idPrenotazione
        // ed eliminarlo
        // Povero me, avrei potuto implementare la lista delle
        // prenotazioni come una HashMap o un TreeMap
        // dato che non l'ho fatto, devo scandirmi tutti gli elementi
        // della lista
        for (Prenotazione x : prenotazioni) {
            if (x.id == idPrenotazione) {
                prenotazioni.remove(x);
                break;
            }
        }

        // avrei anche potuto fare in questo modo
        /*Iterator<Prenotazione> it = prenotazioni.iterator();
        while (it.hasNext()) {
            Prenotazione x = it.next();
            if (x.id == idPrenotazione) {
                it.remove();
                break;
		
            }
			
        }
    */ 
 }
}
