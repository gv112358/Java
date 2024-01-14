import java.util.LinkedList;
import java.util.List;

class Prenotazione {
	public String nome;
	public int id;

	public Prenotazione(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
}

public class Evento {
	String descrizione;
	String luogo;
	String data;

	List<Prenotazione> prenotazioni;

	public Evento(String descrizione, String luogo, String dataevento) {
		this.descrizione = descrizione;
		this.luogo = luogo;
		this.data = dataevento;
		prenotazioni = new LinkedList<>();
	}

	public String toString() {
        return "Evento [descrizione:" + descrizione + ", luogo:" + luogo + ", data evento=" + dataevento + "]";
    }
	// torna l'id (intero) delle prenotazione
	public int Prenota(String nome) {
		int newId = prenotazioni.size(); // Genera un nuovo ID incrementando la dimensione della lista
		Prenotazione nuovaPrenotazione = new Prenotazione(nome, newId); // Crea una nuova prenotazione
		prenotazioni.add(nuovaPrenotazione); // Aggiungi la prenotazione alla lista delle prenotazioni
		return newId; // Restituisci l'ID della prenotazione appena creata
	}

	public void EliminaPrenotazione(int idPrenotazione) {
		for (Prenotazione prenotazione : prenotazioni) {
			if (prenotazione.id == idPrenotazione) {
				prenotazioni.remove(prenotazione); // Rimuovi la prenotazione dalla lista
				break; // Esci dal ciclo una volta trovata e rimossa la prenotazione
	}
}
}
}