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

    public void drive(){
        if(this.engine.running){
            this.accelerate();
        } else {
            System.out.println(make + " " + model + " is not running.");
        }
    }

    protected abstract void accelerate();

}
