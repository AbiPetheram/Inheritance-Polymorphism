package Vehicles;

public class Car extends Vehicles{
    public Car(String make, String model) {
        super(make, model);
        engine = new CarEngine(1,"2");
    }
}
