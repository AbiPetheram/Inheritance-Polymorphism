package shapes;

public class Sphere extends Shape3D{
    Circle base;

    public Sphere(Circle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}