import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EventTicketingApp {
    public static void main(String[] args) {

        TicketingSystem ticketingSystem = new TicketingSystem();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("********** Event Ticketing **********");
                System.out.println("1. Create new event");
                System.out.println("2. Book tickets for an event");
                System.out.println("3. Cancel booking");
                System.out.println("4. Print all events");
                System.out.println("5. Sort events by date");
                System.out.println("0. Exit");

                System.out.print("Select an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Create new event
                        System.out.print("Description: ");
                        scanner.nextLine();
                        String description = scanner.nextLine();
                        System.out.print("Location: ");
                        String location = scanner.nextLine();
                        System.out.print("Date (dd/MM/yyyy): ");
                        String dateString = scanner.nextLine();

                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        try {
                            Date date = dateFormat.parse(dateString);
                            ticketingSystem.addEvent(description, location, date);
                            System.out.println("New event created.");
                        } catch (ParseException e) {
                            System.out.println("Error: Invalid date format.");
                        }
                        break;

                    case 2:
                        // Book tickets for an event
                        System.out.print("Event description: ");
                        scanner.nextLine(); // Consume the leftover newline character
                        String eventDescription = scanner.nextLine();
                        System.out.print("Customer name: ");
                        String customerName = scanner.nextLine();

                        try {
                            int bookingId = ticketingSystem.addBooking(eventDescription, customerName);
                            if (bookingId != -1) {
                                System.out.println("Booking successful. Booking ID: " + bookingId);
                            } else {
                                System.out.println("Event not found.");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 3:
                        // Cancel booking
                        System.out.print("Event description: ");
                        scanner.nextLine(); // Consume the leftover newline character
                        String eventDescriptionCancellation = scanner.nextLine();
                        System.out.print("Booking ID to cancel: ");
                        try {
                            int cancellationId = scanner.nextInt();
                            boolean bookingCancelled = ticketingSystem.cancelBooking(eventDescriptionCancellation, cancellationId);
                            if (bookingCancelled) {
                                System.out.println("Booking cancelled successfully.");
                            } else {
                                System.out.println("Event or booking not found.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid input. Enter a numeric ID.");
                            scanner.nextLine();
                        }
                        break;

                    case 4:
                        // Print all events
                        ticketingSystem.printEvents();
                        break;

                    case 5:
                        // Sort events by date
                        ticketingSystem.sortEventsByDate();
                        System.out.println("Events sorted by date.");
                        break;

                    case 0:
                        // Exit the program
                        System.out.println("Program terminated.");
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

                System.out.println();
            }
        }
    }
}


