import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;  

class Booking {
    public String nome;
    public int id;

    public Booking(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String toString() {
        return String.format("Nome: %s, Id: %d", nome, id);
    }
}

public class Event {
    private String descrizione;
    private String luogo;
    private Date data;
    private AtomicInteger numeroUnico;
    private List<Booking> prenotazioni;

    public Event(String descrizione, String luogo, Date data) {
        this.descrizione = descrizione;
        this.luogo = luogo;
        this.data = data;
        this.prenotazioni = new ArrayList<>();
        this.numeroUnico = new AtomicInteger(0);
    }

    public String getDescription() {
        return descrizione;
    }

    public Date getDate() {
        return data;
    }

    public int bookTicket(String nome) {
        int id = numeroUnico.getAndIncrement();
        Booking p = new Booking(nome, id);
        prenotazioni.add(p);
        return id;
    }

    public boolean cancelTicket(int idBooking) {
        Iterator<Booking> iterator = prenotazioni.iterator();
        while (iterator.hasNext()) {
            Booking Booking = iterator.next();
            if (Booking.id == idBooking) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Description: %s, Luogo: %s, Data: %s\n", descrizione, luogo, data));
        for (Booking Booking : prenotazioni) {
            sb.append("\t").append(Booking.toString()).append("\n");
        }
        return sb.toString();
    }
}
