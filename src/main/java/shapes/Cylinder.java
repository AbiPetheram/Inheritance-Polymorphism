package shapes;

public class Cylinder extends Shape3D{
    double height;
    Circle base;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return this.base.calculateArea() * this.height;
    }

    @Override
    public Shape getBase() {
        return this.base;
    }
}
