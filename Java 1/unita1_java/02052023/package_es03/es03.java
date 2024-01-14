package package_es03;

import java.util.Scanner;

/*ES03: Creare una classe Java chiamata "Veicolo" con i seguenti attributi: 
    - marca (String), 
    - modello (String) e 
    - anno (int).
Quindi, creare una sottoclasse di Veicolo chiamata 
    Auto
con un attributo aggiuntivo chiamato
    - numDoors (int).

    Nel costruttore di Car, utilizzare la parola chiave "super" per
    richiamare il costruttore di Vehicle e impostare gli attributi make,
    model e year. Infine, scrivete un programma che crei un'istanza di
    Auto e ne stampi marca, modello, anno e numero di porte.*/
public class es03 {
    public static void main(String[] args) {
        System.out.println(" \n **************here are some vehicles************** \n");
        // Car auto = new Car("toyota", "yaris", 1990, 5);
        // auto.printCar();

        Car[] carList = new Car[3];

        for (int i = 0; i < 3; i++) {

            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter the car make: ");
            String make = input.nextLine();
            if (make.length() == 0) {
                break;
            }
            System.out.print("Enter the car model: ");
            String model = input.nextLine();
            System.out.print("Enter the car year: ");
            int year = input.nextInt();
            System.out.print("Enter the car doors number: ");
            int doorsNum = input.nextInt();

            Car auto = new Car(make, model, year, doorsNum);
            carList[i] = auto;

        }
        for (int i = 0; i < 3; i++) {
            carList[i].printCar();
        }

    }
}
