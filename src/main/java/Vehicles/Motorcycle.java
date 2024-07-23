package Vehicles;

public class Motorcycle extends Vehicles{
    boolean hasSidecar;

    public Motorcycle(String make, String model, boolean hasSideCar, int horsepower, String fuelType) {
        super(make, model);
        engine = new MotorcycleEngine(horsepower, fuelType);
        this.hasSidecar = hasSideCar;

    }


    @Override
    protected void accelerate() {
        String message = make + " " + model + " speed: ";
        double fuelMod = switch (this.engine.fuelType) {
            case "Unleaded" -> 1.5D;
            case "Leaded" -> 1.2D;
            case "Diesel" -> 1.8D;
            default -> throw new IllegalStateException("Unexpected value: " + this.engine.fuelType);
        };
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(message + String.format("%.2f", ((engine.horsepower * fuelMod) * Math.exp(Math.sqrt(i)) / 2)* (hasSidecar ? 0.8 : 1.0)));
        }
    }
}


