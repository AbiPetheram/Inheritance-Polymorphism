package Vehicles;

public class Motorcycle extends Vehicles{
    boolean hasSidecar;

    public Motorcycle(String make, String model, boolean hasSideCar) {
        super(make, model);
        engine = new MotorcycleEngine(1,"2");
        this.hasSidecar = hasSideCar;

    }


}


