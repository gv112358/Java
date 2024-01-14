package package_es03;

public class Car extends Vehicle {
    int doorsNum;

    public Car(String make, String model, int year, int doorsNum) {
        super(make, model, year);
        this.doorsNum = doorsNum;
    }

    public void printCar() {
        System.out.println("\nThe vehicle is a " + this.getClass().getSimpleName() + "\n make: " + this.make
                + "\n model: " + this.model + "\n year:  " + this.year + "\n doors: " + doorsNum);
    }

}
