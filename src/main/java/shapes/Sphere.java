package shapes;

public class Sphere extends Shape3D{
    Circle base;

    public Sphere(Circle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return (4.0/3.0)*(3.14*(this.base.radius * this.base.radius * this.base.radius));
    }

    @Override
    public Shape getBase() {
        return this.base;
    }
}
