package Vehicles;

public class Main {
    public static void main(String[] args) {
        Motorcycle fastMotorcycle = new Motorcycle("Hyundai", "fast model", false, 3, "Diesel");
        Motorcycle notAsFastMotorcycle = new Motorcycle("Yamaha", "a different model", true, 6, "Leaded");
        Car speedyBoy = new Car("Toyota", "Yaris");
        Car sluggishOne = new Car("Aston Martin", "DB11");

        fastMotorcycle.start();
        fastMotorcycle.drive();
        notAsFastMotorcycle.start();
        notAsFastMotorcycle.drive();
    }
}
