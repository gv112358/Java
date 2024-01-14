import java.util.LinkedList;
import java.util.List;

public class Biglietteria {

	// la biglietteria gestisce un elenco di Eventi.
	// Quindi deve prevedere metodi che creano un evento e lo aggiungono
	// all'elenco degli eventi

	// per ogni evento in biglietteria, la biglietteria prevede
	// dei metodi di prenotazione (del tipo Prenota(evento, nomedellapersona))
	// che aggiungono la prenotazione alla lista dei prenotati

	// la biglietteria gestisce una lista di eventi
	List<Evento> eventi;

	public Biglietteria() {
		eventi = new LinkedList<>();
	}

	public boolean addEvento(String descrizione, String luogo, String data) {
		// Creo nuovo evento
		Evento ev = new Evento(descrizione, luogo, data);
		//aggiungo evento alla lista eventi
		return eventi.add(ev);
	}

	// Altro metodo da implementare: aggiungiPrenotazione (nome dell'evento, nome
	// della persona che intende prenotarsi)

	public int aggiungiPrenotazione(String descrizione_evento, String nome_cliente) {
		// cerco negli eventi quello con la stessa descrizione
		//aggiungo all'evento la nuova prenotazione
		for (Evento e: eventi) {
			if (e.descrizione.compareTo(descrizione_evento) == 0) {
				int id = e.Prenota(nome_cliente);
				return id;
			}
		}
		return -1;
	}

	// Altro metodo da implementare: StampaTuttiGliEventi (ricordare che la toString
	// nella classe consente a System.out.println di stampare senza problemi gli
	// oggetti della classe)

	// Altro metodo da implementare: OrdinaGliEventiPerData
	// In modo da stampare un evento degli eventi a partire dalla data più vicina
	// fino alla data più lontana

}
