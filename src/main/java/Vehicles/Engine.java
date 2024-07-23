package Vehicles;

public class Engine {
    boolean running;

    public Engine(int horsepower, String fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    int horsepower;
    String fuelType;

    public void start(){
        this.running = true;
    }
}
