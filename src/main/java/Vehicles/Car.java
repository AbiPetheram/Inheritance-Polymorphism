package Vehicles;

public class Car extends Vehicles{
    public Car(String make, String model) {
        super(make, model);
        engine = new CarEngine(1,"Unleaded");
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
            System.out.println(message + String.format("%.2f", (engine.horsepower * fuelMod) * Math.exp(Math.sqrt(i)) / 2));
        }

    }


}
