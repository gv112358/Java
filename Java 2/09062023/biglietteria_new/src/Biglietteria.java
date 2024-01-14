import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Biglietteria {

	List<Evento> eventi;

	public Biglietteria() {
		eventi = new LinkedList<>();
	}

	public boolean addEvento(String descrizione, String luogo, String data) {
		Evento nuovoEvento = new Evento(descrizione, luogo, data);
		return eventi.add(nuovoEvento);
	}

	public boolean aggiungiPrenotazione(String nomeEvento, String nomePersona) {
		for (Evento evento : eventi) {
			if (evento.descrizione.equals(nomeEvento)) {
				int idPrenotazione = evento.Prenota(nomePersona);
				return idPrenotazione != -1;
			}
		}
		return false;
	}

	public void StampaTuttiGliEventi() {
		for (Evento evento : eventi) {
			System.out.println(evento);
		}
	}

	public void OrdinaGliEventiPerData() {
		Collections.sort(eventi, (evento1, evento2) -> evento1.data.compareTo(evento2.data));
	}
	public void EliminaPrenotazione(int idPrenotazione) {
		for (Evento evento : eventi) {
			List<Prenotazione> prenotazioni = evento.prenotazioni;
			
			for (int i = 0; i < prenotazioni.size(); i++) {
				Prenotazione prenotazione = prenotazioni.get(i);
				
				if (prenotazione.id == idPrenotazione) {
					prenotazioni.remove(i);
					System.out.println("Prenotazione rimossa con successo.");
					return;
				}
			}
		}
		
		System.out.println("Prenotazione non trovata.");
	}
	
}
