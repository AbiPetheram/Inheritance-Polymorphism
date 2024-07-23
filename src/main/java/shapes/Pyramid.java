package shapes;

public class Pyramid extends Shape3D{
    double height;
    Shape base;

    public Pyramid(Shape base, double height ) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (this.base.calculateArea() * this.height)/3;
    }

    @Override
    public Shape getBase() {
        return this.base;
    }
}
