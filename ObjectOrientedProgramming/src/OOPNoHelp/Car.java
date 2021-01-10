package OOPNoHelp;

public class Car {

//instance variables    
    public String make;
    public String model;
    public double price;
    public String style;
    public double lastOdometerReading;

//constructor methods
    public Car(String mk, String ml, double p, String s) {
        make = mk;
        model = ml;
        price = p;
        style = s;
        lastOdometerReading = 0;

    }

//instance methods
    public void fillCar(double litresFilled, int newOdometerReading) {
        double mileage = ((litresFilled * 100) / (newOdometerReading - lastOdometerReading));
        System.out.println("Mileage since last fill up: " + mileage + " litres per 100km.");
        lastOdometerReading = newOdometerReading;
    }

}
