import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class TicketingSystem {

    private List<Event> events;

    public TicketingSystem() {
        events = new ArrayList<>();
    }

    public void addEvent(String description, String location, Date date) {
        Event event = new Event(description, location, date);
        events.add(event);
    }

    public int addBooking(String eventDescription, String customerName) {
        for (Event e : events) {
            if (e.getDescription().equals(eventDescription)) {
                return e.bookTicket(customerName);
            }
        }
        return -1;
    }

    public boolean cancelBooking(String eventDescription, int bookingId) {
        for (Event e : events) {
            if (e.getDescription().equals(eventDescription)) {
                return e.cancelTicket(bookingId);
            }
        }
        return false;
    }

    public void printEvents() {
        for (Event e : events) {
            System.out.println(e.toString());
        }
    }

    public void sortEventsByDate() {
        events.sort(Comparator.comparing(Event::getDate));
        for (Event e : events) {
            System.out.println(e.toString());
        }
    }
}
