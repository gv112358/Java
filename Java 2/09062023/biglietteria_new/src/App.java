import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Biglietteria biglietteria = new Biglietteria(); // Crea una nuova biglietteria
        Scanner scanner = new Scanner(System.in);
        
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Crea nuovo evento");
            System.out.println("2. Prenotati a un evento");
            System.out.println("3. Cancella prenotazione");
            System.out.println("4. Stampa lista eventi");
            System.out.println("5. Exit");
            
            System.out.print("Seleziona un'opzione: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consuma la nuova riga dopo la lettura del numero
            
            switch (choice) {
                case 1:
                    System.out.print("Descrizione evento: ");
                    String descrizione = scanner.nextLine();
                    
                    System.out.print("Luogo evento: ");
                    String luogo = scanner.nextLine();
                    
                    System.out.print("Data evento: ");
                    String data = scanner.nextLine();
                    
                    boolean success = biglietteria.addEvento(descrizione, luogo, data);
                    
                    if (success) {
                        System.out.println("Evento creato con successo.");
                    } else {
                        System.out.println("Errore durante la creazione dell'evento.");
                    }
                    
                    break;
                
                case 2:
                    System.out.print("Nome dell'evento: ");
                    String nomeEvento = scanner.nextLine();
                    
                    System.out.print("Nome della persona: ");
                    String nomePersona = scanner.nextLine();
                    
                    success = biglietteria.aggiungiPrenotazione(nomeEvento, nomePersona);
                    
                    if (success) {
                        System.out.println("Prenotazione effettuata con successo.");
                    } else {
                        System.out.println("Errore durante la prenotazione.");
                    }
                    
                    break;
                
                case 3:
                    System.out.print("ID della prenotazione da cancellare: ");
                    int idPrenotazione = scanner.nextInt();
                    scanner.nextLine(); // Consuma la nuova riga dopo la lettura del numero
                    
                    biglietteria.EliminaPrenotazione(idPrenotazione);
                    System.out.println("Prenotazione cancellata con successo.");
                    break;
                
                case 4:
                    System.out.println("Lista eventi:");
                    biglietteria.StampaTuttiGliEventi();
                    break;
                
                case 5:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
