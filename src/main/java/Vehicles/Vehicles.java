package Vehicles;

public abstract class Vehicles {
    String make;
    String model;
    int speed;
    Engine engine;

    public Vehicles(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        engine.start();
    };
}
